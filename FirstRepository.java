public class FirstRepository{
	 public static void main(String[]args){
		 int v[10] = {0,1,2,3,4,5,6,7,8,9};
		 int soma = v[0];
		 for (int i = 1; i < v.length; i++) 
			 soma += v[i];
		 System.out.println("Soma dos valores do vetor: "+soma);
	 }	 
}