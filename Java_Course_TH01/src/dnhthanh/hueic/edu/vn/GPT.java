package dnhthanh.hueic.edu.vn;

public class GPT {

	public static void thuchien(float a, float b, float c) {
		//Viết nội dung giải phương trình bậc 2 vào đây
		 }if (a == 0) {
			if (b == 0) {
				if (c == 0 ) 
					System.out.println("Phương trình vô nghiệm!");
				else 
					;
			} else {
				System.out.println("Phương trình có một nghiệm: " + "x = " + (-c / b));
			}

		} else {

			// tính delta
	        float delta = b*b - 4*a*c;
	        float x1;
	        float x2;
	        // tính nghiệm
	        if (delta > 0) {
	            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
	            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
	            System.out.println("Phương trình có 2 nghiệm là: "
	                    + "x1 = " + x1 + " và x2 = " + x2);
	        } else if (delta == 0) {
	            x1 = (-b / (2 * a));
	            System.out.println("Phương trình có nghiệm kép: "
	                    + "x1 = x2 = " + x1);
	        } else {
	            System.out.println("Phương trình vô nghiệm!");
	        }
	}
}
