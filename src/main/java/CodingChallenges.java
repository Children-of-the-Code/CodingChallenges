public class CodingChallenges {
    /*
    eggs hatch at a rate of twice the previous day
    and we start from 1 egg hatched
    how many eggs hatch on day N?

    someone told me about this problem
    and gave a list of different values of N

    and told me to come up with a standard process for solving this problem

    imagine i have a pencil and paper...
    2^(N-1)
    this is good as a math equation, but i can't really do them well in my head
    what if I want N=100? that's hard..

    we start from 1 -
    result = 1
    then, after that, from day 2,
    we start from multiplying the result by 2
    result = 2
    do this for every day (for n-1 days)
     */
    public static void main(String[] args) {
        int result = 1;
        int days = 30;

        for(int i = 1; i <= days; i++){
            System.out.println("Eggs hatched on day " + i+ " : " + result);
            result = result *2;

        }

    }
}
