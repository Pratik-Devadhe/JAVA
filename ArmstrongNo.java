class ArmstrongNo {


public static void main(String s[]){



int num = 153;
int len = Integer.toString(num).length(num);
int cheak = num;
int sum =0;
int rem = 0;

while(num > 0){

	rem = num % 10;
	for(int i=0; i<len; i++){
	
	rem = rem * rem;
	
	}
	sum = sum +rem;
	num = num /10;

}


if(cheak == sum){
	System.out.println(cheak + " is an Armstrongs number");
} 
else{

System.out.print(cheak + " is not an Armstrongs number");
}

}


}
