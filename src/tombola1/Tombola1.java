/*
 *un supermercado realiza una tombola con todos los clientes, si son 
hombres tienen que sacar de una canasta una bolitala cual tiene un numero grabado 
y si son mujeres lo mismo pero otra canasta, los premios se dan bajo la siguiente tabla 
hombres                      mujeres 
#bolita premio       
1            desodorante     locion 
2    six-pack cerveza        bikini
3    camiseta                crema para la cara
4    pantaloneta             plancha para el cabello
5    sudadera                esmalte de uñas
 */
 package tombola1;

import java.util.Scanner;

/**
 *
 * josselyne ester chilito galindez cod: 20201187434
 */
public class Tombola1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada=new Scanner (System.in);
       int mh,bola;
        System.out.println("_______________________");
        System.out.println("si es hombre diguite 1");
        System.out.println("si es mujer diguite 2 ");
        System.out.println("_______________________");
        mh=entrada.nextInt();
        
        if (mh==1){
            System.out.println("el numero de bola te salio");
            bola=entrada.nextInt();
            
            switch (bola){
                case 1:
                    System.out.println("tu premio es un desodorante");
                    break;
                case 2:
                    System.out.println("tu premio es un six-pack de cervezas");
                    break;
                case 3:
                    System.out.println("tu premio es camisa");
                    break;
                case 4:
                    System.out.println("tu premio es una sudadera");
                    break;
                case 5:
                    System.out.println("sudadera");
                    break;
                default:
                    System.out.println("no ah ganado ningun premio");
                
            }
        }
        else {
            if (mh==2){
                System.out.println("que numero de bola te salio");
                bola=entrada.nextInt();
                
                switch (bola){
                    case 1:
                        System.out.println("tu premio es una locion");
                    case 2:
                    System.out.println("tu premio es un bikini");
                    break;
                    case 3:
                    System.out.println("tu premio es una crema para la cara");
                    break;
                    case 4:
                    System.out.println("tu premio es una plancha para cabello");
                    break;
                    case 5:
                    System.out.println("tu premio es un esmalte de unñas");
                    break;
                default:
                    System.out.println("no ah ganado ningun premio");
                    
                }
            }
            
        }
       
    }
    
}
