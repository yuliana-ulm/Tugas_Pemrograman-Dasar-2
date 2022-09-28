public class Perulangan{
    public static void main(String[] arguments){
        String tampil;
        int i;

        tampil = "Aturan 1 Perulangan ke-";
        i = 0; 
        while (i < 7) { 
            //System.out.println(tampil + i); 
            i = i+1; 
        }

        tampil = "Aturan 2 Perulangan ke-";
        for (i = 0; i < 3; i=i+1) { 
            //System.out.println(tampil + i); 
        }

        tampil = "Aturan Break ke-";
        for (i=0; i<10; i++){
            if (i==5){
                break;
            }
            //System.out.println(tampil + i);
        }

        tampil = "Aturan Continue ke-";
        for (i=0; i<10; i++){
            if (i==5){
                continue;
            }
            System.out.println(tampil + i);
        }

        String spasi = "ke";
        for (i = 0; i < 3; i++) { 
            for (int j = 2; j < 4; j++) { 
            System.out.println (i + spasi + j); 
            } 
        }
        
        tampil = "data ke-";
        for (i=0; i<10; i++){
            if (i==5){
                continue;
            }
            System.out.println(tampil + i);
        }
        
        tampil = " ";
        for (i = 0; i < 3; i++) { 
            for (int j = 2; j < 4; j++) { 
            System.out.println (i + tampil + j); 
            } 
        }	
        
        int[] values = new int[5];
        for (i = 0; i < values.length; i++){
	        values[i] = i;
	        int y = values[i] *values[i];
	        System.out.println(y);
        }

        int[] values1 = new int[7];
        i = 0;

        while (i < values1.length){
            values1[i] = i;
            int y = values1[i] * values1[i];
            System.out.println(y);
		    i++;
        }
    }
}