public class Website
{
    private int numUsers;
    private String topLevelDomain;
    private String domain;
    public Website(){
        domain = "";
        topLevelDomain = "com";
        numUsers = 0;
    }
    public Website(String domainName, String topDomain){
        domain = domainName;
        topLevelDomain = topDomain;
        numUsers= 0;
    }
    public Website(String domainName, String topDomain, int numPeople){
        domain = domainName;
        topLevelDomain = topDomain;
        numUsers = numPeople;
    }

    public String toString()
    {
        String res =  "https://www." + domain + "." + topLevelDomain;
        res += " has " + numUsers + " users";

        return res;
    }
}