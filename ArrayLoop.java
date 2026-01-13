public class ArrayLoop {
    public static void main(String[] args) {

        int[][] x1 = new int[10][10];  // ประกาศ 2d array 10x10
        int[][] x2 = new int[10][10];

        randomX(x1);   //เรียกใช้งานการสุ่มเลข 50-59 ไว้ใน array
        randomX(x2);

        System.out.println("Array 1 = ");  //แสดงค่าข้อมูลทั้งหมดใน 2DArray โดยแสดงผลเป็นลักษณะตาราง
        printX(x1);
        System.out.println("Array 2 = ");
        printX(x2);        
        int[][] sum = sumX(x1, x2);         //method เพื่อ บวกค่าของ array ทั้งสองตัวในตำแหน่งเดียวกัน และเก็บผลลัพธ์ลงใน array ใหม่
        System.out.println("Sum Array = ");
        printX(sum);
    }

    public static void randomX(int [][] x){   //สุ่มค่าจำนวนเต็มระหว่าง 50 – 59 และเก็บลงในทุกตำแหน่งของ 2D Array
        for (int i = 0; i<x.length; i++)
        for (int j = 0; j<x[i].length; j++)
        x[i][j] = (int)(Math.random()*10)+50;
    }
    public static void printX(int [][] x){  //method แสดงค่าข้อมูลทั้งหมดใน 2D Array เป็นลักษณะตาราง
        for (int[] row : x){
            for (int v : row){
                System.out.print(v + " ");
            }
            System.out.println(); 
        }
    }
    public static int[][] sumX(int[][] x, int[][] y) {  //ประกาศ 2D Array อีก 1 ตัว และเขียน method บวกค่าของ array ทั้งสองตำแหน่งเดียวกัน
        int[][] result = new int[10][10];

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                result[i][j] = x[i][j] + y[i][j];
    }
    
}
return result;
    }
}
