public class TuitionCalc {
    public static void main(String[] args) throws Exception {
        //t=tuition, inc=tuition increase, tsum=tuition in 10 years, nyear=4 years of tuition
        double nyear = 0;
        int t = 10000;
        double tsum = 0;

        // Calculating the cost of Tuition for 10 years
        for (int i = 1; i <= 10; i++) {
            t += t * 0.05; 
            if (i == 10) {
                tsum = t; 
            }
        }

        // Figuring out eh total cost of four years after the 10th year
        for (int i = 1; i <= 4; i++) {
            nyear += tsum; 
            tsum += tsum * 0.05; 
        }

        // Print the results
        System.out.printf("Tuition after 10 years costs: $%.2f\n", tsum);
        System.out.printf("After 10 years, the cost for 4 years of tuition is: $%.2f\n", nyear);
    }
}

// Psuedocode
// START

    // Set tuition = 10000
    // Set nyear = 0
    // Set tsum = 0

    // FOR year = 1 TO 10
        // Increase the tuition by 5% (tuition = tuition + (tuition * 0.05))
        // IF year is 10 THEN
            // Set tsum = tuition
        // END IF
    // END FOR

    // FOR year = 1 TO 4
        // Add tsum to nyear
        // Increase tsum by 5% (tsum = tsum + (tsum * 0.05))
    // END FOR

    // PRINT "Tuition after 10 years costs: " + tsum
    // PRINT "After 10 years, the cost for 4 years of tuition is: " + nyear

// END
