class amstrong{




public static void main(String args[]){




int a = Integer.parseInt(args [0]);


int res;
int sum = 0;

int c = a;
while (a>0){


res = a%10;

sum = res * res * res + sum;

a = a/10;

}

if (c ==sum){

System.out.println("This is amstrong Number");


}else{

System.out.println("This is not amstrong number");


}

}

}


