public class DACArecipient {
    // Constants for printCard
    private static final String TITLE_USA = "UNITED STATES OF AMERICA";
    private static final String TITLE_EAC = "EMPLOYMENT AUTHORIZATION CARD";

    // ASCII Art lines
    private static final String[] ASCII = {
        "    .----.    .----.  ",
        "   (  --  \\/  --  )",
        "          |  |        ",
        "         _/  \\_      ",
        "        (_    _)      ",
        "     ,    `--`    ,   ",
        "     '\\-.______.-'/  ",
        "      \\          /   ",
        "       '.--..--.'     ",
        "         `\"\"\"\"\"` ",
        "   ascii art by: jgs    "
    };

    // Instance variables
    private String surname;
    private String givenName;
    private String uscisNumber;
    private String countryOfOrigin;
    private int birthday;
    private int validFromDate;
    private int expirationDate;
    private char sex;

    // Accessors
    public String getSurname() { return surname; }
    public String getGivenName() { return givenName; }
    public String getUscisNumber() { return uscisNumber; }
    public String getCountryOfOrigin() { return countryOfOrigin; }
    public int getBirthday() { return birthday; }
    public int getValidFromDate() { return validFromDate; }
    public int getExpirationDate() { return expirationDate; }
    public char getSex() { return sex; }

    // Mutators
    public void setSurname(String surname) { this.surname = surname; }
    public void setGivenName(String givenName) { this.givenName = givenName; }
    public void setUscisNumber(String uscisNumber) { this.uscisNumber = uscisNumber; }
    public void setCountryOfOrigin(String countryOfOrigin) { this.countryOfOrigin = countryOfOrigin; }
    public void setBirthday(int birthday) { this.birthday = birthday; }
    public void setValidFromDate(int validFromDate) { this.validFromDate = validFromDate; }
    public void setExpirationDate(int expirationDate) { this.expirationDate = expirationDate; }
    public void setSex(char sex) { this.sex = sex; }

    // Bulk setter
    public void setAll(String surname, String givenName, String uscisNumber,
                       String countryOfOrigin, int birthday,
                       int validFromDate, int expirationDate, char sex) {
        this.surname = surname;
        this.givenName = givenName;
        this.uscisNumber = uscisNumber;
        this.countryOfOrigin = countryOfOrigin;
        this.birthday = birthday;
        this.validFromDate = validFromDate;
        this.expirationDate = expirationDate;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Surname: " + surname + ", Given Name: " + givenName +
               ", USCIS Number: " + uscisNumber + ", Country of Origin: " + countryOfOrigin +
               ", Birthday: " + birthday + ", Valid From Date: " + validFromDate +
               ", Expiration Date: " + expirationDate + ", Sex: " + sex;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof DACArecipient)) return false;
        DACArecipient other = (DACArecipient) obj;
        return surname.equals(other.surname) &&
               givenName.equals(other.givenName) &&
               uscisNumber.equals(other.uscisNumber) &&
               countryOfOrigin.equals(other.countryOfOrigin) &&
               birthday == other.birthday &&
               validFromDate == other.validFromDate &&
               expirationDate == other.expirationDate &&
               sex == other.sex;
    }

    public String printCard() {
        return "" +
            "╔══════════════════════════════════════════════════════════════════════╗\n" +
            String.format("║%35s%35s║\n", TITLE_USA, "") +
            String.format("║%60s%10s║\n", TITLE_EAC, "") +
            String.format("║%-25s%-45S║\n", "", "Surname") +
            String.format("║%-25s%-45s║\n", ASCII[0], surname) +
            String.format("║%-25s%-45S║\n", ASCII[1], "Given Name") +
            String.format("║%-25s%-45s║\n", ASCII[2], givenName) +
            String.format("║%-25s%-45S║\n", ASCII[3], "USCIS#") +
            String.format("║%-25s%-45s║\n", ASCII[4], uscisNumber) +
            String.format("║%-25s%-45S║\n", ASCII[5], "Country of Birth") +
            String.format("║%-25s%-45s║\n", ASCII[6], countryOfOrigin) +
            String.format("║%-25s%-15S%-30S║\n", ASCII[7], "Date of Birth", "Sex") +
            String.format("║%-25s%-15s%-30s║\n", ASCII[8], jdnToDate(birthday), sex) +
            String.format("║%-25s%-15S%-30s║\n", ASCII[9], "Valid From:", jdnToDate(validFromDate)) +
            String.format("║%-25s%-15S%-30s║\n", ASCII[10], "Card Expires:", jdnToDate(expirationDate)) +
            String.format("║%-25s%-45s║\n", "", "NOT VALID FOR REENTRY TO U.S.") +
            "╚══════════════════════════════════════════════════════════════════════╝\n";
    }

    public static String jdnToDate(int J) {
        int B = 274277, C = -38;
        int f = J + 1401 + (((4 * J + B) / 146097) * 3) / 4 + C;
        int e = 4 * f + 3;
        int g = (e % 1461) / 4;
        int h = 5 * g + 2;
        int D = ((h % 153) / 5) + 1;
        int M = ((h / 153) + 2) % 12 + 1;
        int Y = (e / 1461) - 4716 + (12 + 2 - M) / 12;
        return String.format("%02d/%02d/%04d", M, D, Y);
    }
}
