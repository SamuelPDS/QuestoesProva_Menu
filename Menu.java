package respostava1;
import java.util.Scanner;
import java.util.ArrayList;

public class RespostaVA1 {
static int questao1(){
    int cont = 0;
    int soma = 0;
    for ( int i =1; i<=20; i++){
    if ((i%2)==0){
    //System.out.println("O número é par"+i);
       
    }else {
    //System.out.println("O número é impar"+i);
    if (cont<=10){
    soma = soma+i;
    }
    }
    }
      System.out.println("A soma dos primeiro números impares é"+soma);
    return soma;
}   

static int questao2(){
    int a = 0;
    int b = 0;
    int soma1 = 0;
    int soma2 = 0;

    String [] nome =  { "S", "a", "m", "u", "e", "l"};
    String []  sobrenome = { "C", "h", "a", "r", "l", "e", "s"};
 
     soma1 = nome.length;                                        
     soma2 = sobrenome.length;
        System.out.println("Total 1: "+soma1);
        System.out.println("Total 2: "+soma2);
    return soma1+soma2;
} 

static int questao3(){
    
    int cont = 0;
    int produto = 0;
    int percorrer = 0;
    ArrayList <Integer> multiplo = new ArrayList();
    for (int mul=1; mul<=30; mul++){
    if(mul%5==0){    
    multiplo.add(mul);
    for (int num : multiplo){
    percorrer = multiplo.indexOf(num);    
    produto = produto+percorrer*num;
        System.out.println("O produto é" +produto);
    }
    }else{
    continue;  
}
}
return produto;
} 

static String questao4(){
    String nome = "Samuel";
    String sobrenome = "Charles";
    String data = "19/12/2002";
        System.out.println("Seus dados são: nome: "+nome);
        System.out.println("sobrenome: "+sobrenome);
        System.out.println("data de nascimento: "+data);
 return nome+sobrenome+data;
 }
    
static int menu(){
System.out.println("Ola, digite: 1 - Questao 1, 2 - Questao 2, 3 - divisao, 4 -Questao 4, -1 - sair");
Scanner sc = new Scanner(System.in);
int operacao = sc.nextInt();

switch (operacao){
case 1:
questao1();        
break;

case 2: 
questao2();
break;            

case 3:
questao3();
break;          

case 4: 
questao4();        
}
return operacao;
}
   
    

    public static void main(String[] args) {
    menu();
    }
    
}
