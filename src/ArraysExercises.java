public class ArraysExercises {

    public static void main(String[] args) {

        int[][] personArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        addPerson(personArray);
        
// access the first element in the second row
        System.out.println(personArray[1][0]); // 4
// the last element in the first row
        System.out.println(personArray[0][2]); // 3
// the first element in the last row
        System.out.println(personArray[2][0]); // 7
}

    static void addPerson(int[][] personArray) {
        return personArray.push(new int[]{10, 11, 12});

    }
}
