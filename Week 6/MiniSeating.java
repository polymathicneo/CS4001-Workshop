public class MiniSeating {
    public static void main(String[] args){
        //2 rows, 3 seats per row
        String[][] seats = new String[2][3];
        seats[0][0] = "Ram";
        seats[0][1] = "Sita";
        seats[0][2] = "Neo";
        
        //print seating chart
        System.out.println("Seating Chart: ");
        for (int i = 0; i<seats.length; i++){
            System.out.print("Row " + (i+1) + ": ");
            
            for(int j = 0; j<seats[i].length; j++){
                if (seats[i][j] == null || seats[i][j].equals("")) {
                    System.out.print("[empty] ");
                } else {
                    System.out.print("[" + seats[i][j] + "] ");
                 }
             }
                System.out.println();
            }
        }
    }
        