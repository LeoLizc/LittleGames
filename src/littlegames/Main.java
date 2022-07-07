package littlegames;


import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main {

    public static void main(String[] args) {
        String[] juegos={"Triqui","Punto y Fama","Triqui 2","Salir"};
        int resp,a;
        do{
        
        a=JOptionPane.showOptionDialog(null, "Que juego desea jugar?", "Bienvenido a Juegos mentales",-1, 3, null, juegos, juegos[0]);
        
        switch(a){
            case 0:
                int po=0,k, q, t[]=new int[9];
                String n,ju=null,tl[]= {"1","2","3","4","5","6","7","8","9"};
                String tt[]= {"1","2","3","4","5","6","7","8","9"},t1[]=new String[8],t2[]=new String[7],t3[]=new String[6],
                        t4[]=new String[5],t5[]=new String[4],t6[]=new String[3],t7[]=new String[2];
                boolean gan=false;
                for (int i = 0; i < 9; i++) {
                    t[i]=0;
                }
                k=0;
                do{
                    k++;
                    n="                 ";
                    for (int i = 1; i <=9; i++) {
                        n=n+"| "+tl[i-1]+" ";
                        if (i%3==0) {
                            n=n+"|\n                 ";
                        }
                    }
                    if(k<9){
                        n=n+"\n Elija una posición para jugar\n        turno del jugador "+(2-(k%2));
                    }
                    //crear tablero
                    q=0;
                    switch(k){
                        case 1:
                            po=JOptionPane.showOptionDialog(null, n, "Triqui", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tt, tt[0]);
                            break;
                        case 2:for (int l = 0; l < 8; l++) {
                                if (t[q]==0) {
                                    t1[l]=tt[q];
                                }else{
                                    l--;
                                }
                                q++;
                                }
                            po=JOptionPane.showOptionDialog(null, n, "Triqui", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, t1, t1[0]);
                            po=(Integer.parseInt(t1[po]))-1;
                            break;
                        case 3:for (int l = 0; l < 7; l++) {
                                if (t[q]==0) {
                                    t2[l]=tt[q];
                                }else{
                                    l--;
                                }
                                q++;
                                }
                        po=JOptionPane.showOptionDialog(null, n, "Triqui", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, t2, t2[0]);
                        po=Integer.parseInt(t2[po])-1;
                            break;
                        case 4:for (int l = 0; l < 6; l++) {
                                if (t[q]==0) {
                                    t3[l]=tt[q];
                                }else{
                                    l--;
                                }
                                q++;
                            }
                        po=JOptionPane.showOptionDialog(null, n, "Triqui", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, t3, t3[0]);
                        po=Integer.parseInt(t3[po])-1;
                            break;
                        case 5:for (int l = 0; l < 5; l++) {
                                if (t[q]==0) {
                                    t4[l]=tt[q];
                                }else{
                                    l--;
                                }
                                q++;
                            }
                        po=JOptionPane.showOptionDialog(null, n, "Triqui", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, t4, t4[0]);
                        po=Integer.parseInt(t4[po])-1;
                            break;
                        case 6:for (int l = 0; l < 4; l++) {
                                if (t[q]==0) {
                                    t5[l]=tt[q];
                                }else{
                                    l--;
                                }
                                q++;
                                }
                        po=JOptionPane.showOptionDialog(null, n, "Triqui", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, t5, t5[0]);
                        po=Integer.parseInt(t5[po])-1;
                            break;
                        case 7:for (int l = 0; l < 3; l++) {
                                if (t[q]==0) {
                                    t6[l]=tt[q];
                                }else{
                                    l--;
                                }
                                q++;
                                }
                        po=JOptionPane.showOptionDialog(null, n, "Triqui", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, t6, t6[0]);
                        po=Integer.parseInt(t6[po])-1;
                            break;
                        case 8:for (int l = 0; l < 2; l++) {
                                if (t[q]==0) {
                                    t7[l]=tt[q];
                                }else{
                                    l--;
                                }
                                q++;
                                }
                        po=JOptionPane.showOptionDialog(null, n, "Triqui", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, t7, t7[0]);
                        po=Integer.parseInt(t7[po])-1;
                            break;
                        case 9:
                            for (int l = 0; l < 9; l++) {
                                if (t[l]==0) {
                                    po=l;
                                }
                            }
                            n=n+"\n Se ha quedado sin opciones de juego, solo: "+tt[po]+"\n                          ";
                            JOptionPane.showMessageDialog(null, n+"   por lo tanto:","triqui", JOptionPane.INFORMATION_MESSAGE);
                            //JOptionPane.showOptionDialog(null, n, "Triqui", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, t7, t7[0]);
                            break;
                    }
                    
                    
                    if (t[po]==0) {
                        if(k%2==1){
                            t[po]=1;
                            tl[po]="O";
                        }else{
                            t[po]=2;
                            tl[po]="X";
                        }
                    }else{
                        k--;
                        JOptionPane.showMessageDialog(null, "Esa casilla ya ha sido usada, elija otra", "Advertencia, Triqui", 2);
                    }
                    for (int i = 0; i < 7; i=i+3) {
                        if (t[i]==t[i+1]&&t[i]==t[i+2]&&t[i]!=0) {
                            gan=true;
                            if(t[i]==1){
                                ju="Jugador 1 (O)";
                            }else{
                                ju="Jugador 2 (X)";
                            }
                        }
                        
                    }
                    for (int i = 0; i < 3; i++) {
                        if (t[i]==t[i+3]&&t[i]==t[i+6]&&t[i]!=0) {
                            gan=true;
                            if(t[i]==1){
                                ju="Jugador 1 (O)";
                            }else{
                                ju="Jugador 2 (X)";
                            }
                        }
                    }
                    for (int i = 0; i < 3; i=i+2) {
                        if (t[i]==t[4]&&t[8-i]==t[i]&&t[i]!=0) {
                            gan=true;
                            if(t[i]==1){
                                ju="Jugador 1 (O)";
                            }else{
                                ju="Jugador 2 (X)";
                            }
                        }
                    }
                    
                    
                }while(!gan&&k<9);
                if(gan){
                    JOptionPane.showMessageDialog(null, "¡Felicidades!\nEl ganador ha sido el\n"+ju, "Triqui", -1);
                }else{
                    JOptionPane.showMessageDialog(null, "Ha sido un empate", "triqui", 1);
                }
                 break;
            case 1:
                int g,g1,g2,g3,g4,j,j1,j2,j3,j4,p1,f1,c1=0;
                Scanner leer=new Scanner(System.in);
                do {
                    g=(int)(Math.random()*10000);
                    g4=g%10; g3=(g/10)%10; g2=((g/10)/10)%10; g1=(((g/10)/10)/10)%10;
                    if (g1==g2||g1==g3||g1==g4) {
                        g=0;
                    }else if (g2==g3||g2==g4) {
                        g=0;
                    }else if (g3==g4) {
                        g=0;
                    }
                } while (g<1000||g>10000);
                JOptionPane.showMessageDialog(null, "El objetivo de este juego es adivinar\n"
                        + "Generado por el computador, obteniendo 4 famas\n"
                        + "para obtener una fama es necesario hacertar uno de los dígitos\n"
                        + "y en la posición correcta. Es posible obtener un punto al\n"
                        + "acertar un dígito pero en una pocición incorrecta", "punto y fama", 0);
                do {
                    p1=0;f1=0;
                    do {
                        //System.out.println("Digite un numero para comparar");
                        //System.out.println(g);
                        //j=leer.nextInt();
                        String gj=JOptionPane.showInputDialog(null, "Escriba un numerito natural de\ncuatro dígitos sin repetir", "Punto y Fama", 1);
                        j=Integer.parseInt(gj);
                        j4=j%10; j3=(j/10)%10; j2=((j/10)/10)%10; j1=(((j/10)/10)/10)%10;
                        if (j1==j2||j1==j3||j1==j4) {
                            j=0;
                            JOptionPane.showMessageDialog(null, "el dígito "+j1+" está repetido", "Error", JOptionPane.ERROR_MESSAGE);
                        }else if (j2==j3||j2==j4) {
                            j=0;
                            JOptionPane.showMessageDialog(null, "el dígito "+j2+" está repetido", "Error", JOptionPane.ERROR_MESSAGE);
                        }else if (j3==j4) {
                            j=0;
                            JOptionPane.showMessageDialog(null, "el dígito "+j3+" está repetido", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } while (j<1000||j>10000);
                    if (j1==g1) {
                        f1++;
                    }
                    if (j2==g2) {
                        f1++;
                    }
                    if (j3==g3) {
                        f1++;
                    }
                    if (j4==g4) {
                        f1++;
                    }
                    if (j1==g2||j1==g3||j1==g4) {
                        p1++;
                    }
                    if (j2==g1||j2==g3||j2==g4) {
                        p1++;
                    }
                    if (j3==g1||j3==g2||j3==g4) {
                        p1++;
                    }
                    if (j4==g1||j4==g2||j4==g3) {
                        p1++;
                        }
                    if(f1<4){
                    //System.out.println(f1+" famas, "+p1+" puntos");
                    JOptionPane.showMessageDialog(null, f1+" famas, "+p1+" Puntos", "Punto y Fama", 1);
                    }
                    c1++;
                } while (f1<4);
                JOptionPane.showMessageDialog(null, "¡Felicitaciones! Ha ganado\nNumero de intentos: "+c1, "Punto y Fama", 1);
                //System.out.println("numero de intentos: "+c1);
                break;
            case 2:
                
                int modo,us=0,us1=0,us2=0,mi,pos=0,turno, casillas[]=new int[9],nivel;
                String mesa,jug=null,jug2=null,tablero[]= {" - "," - "," - "," - "," - "," - "," - "," - "," - "};
                String tab[]= {"1","2","3","4","5","6","7","8","9"},tab1[]=new String[8],tab2[]=new String[7],tab3[]=new String[6],
                        tab4[]=new String[5],tab5[]=new String[4],tab6[]=new String[3],tab7[]=new String[2];
                /*Explicación de variables:--us(solo variable extra)----us1 */
                String jugad[]={"Jugador 1 (O)","Jugador 2 (X)"}, dificultad[]={"Extra fácil","medio","casi imposible"};
                boolean ganador=false;
                for (int i = 0; i < 9; i++) {
                    casillas[i]=0;
                }
                turno=0;
                
//**********************************************************SELECCIONA MODO DE JUEGO*********************************************************
                modo=JOptionPane.showOptionDialog(null, "Elija que jugador desea ser:  ", "         Triqui", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, jugad, jugad[0]);
//*********************************************************SELECCIONA MODO DE JUEGO*******************************************************************
                
//******************************************************SELECCIONA DIFICULTAD DE JUEGO********************************************************************
                nivel=JOptionPane.showOptionDialog(null, "Elija que jugador desea ser:  ", "         Triqui", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, dificultad, dificultad[0]);
//******************************************************SELECCIONA DIFICULTAD DE JUEGO********************************************************************
                
                if(nivel!=0){
                    us=(int) (Math.random()*100);
                    //System.out.println("prob"+us);
                    //us=60;//siempre empieza en lado   
                    if(us<50){
                        do{
                            pos= (int) (Math.random()*10);
                        }while(pos%2==1|pos==4|pos>=9);
                    }else{
                        if (us>=50&us<75) {
                            do{
                                pos= (int) (Math.random()*10);
                            }while(pos%2==0|pos>=9);
                        }else{
                            pos=4;   
                        }
                    }
                }
                
//**********************INSTRUCCIONES********************************************
                mesa="                 ";
                    for (int i = 1; i <=9; i++) {
                        mesa=mesa+"| "+tab[i-1]+" ";
                        if (i%3==0) {
                            mesa=mesa+"|\n                 ";
                        }
                    }
                    mesa=mesa+"\n Para jugar debe elegir una\n   posición, como se indicó\n           anteriormente";
                    JOptionPane.showMessageDialog(null, mesa, " INSTRUCCIONES - TRIQUI", 1);
//***********************INSTRUCCIONES*******************************************
                //System.out.println("pos1:"+pos);
                mi=pos;
                do{
                    boolean peligro2=true,fila=false,columna=false,diagonal=false;
                    turno++;
                    mesa="                 ";
                    for (int i = 1; i <=9; i++) {
                        mesa=mesa+"| "+tablero[i-1]+" ";
                        if (i%3==0) {
                            mesa=mesa+"|\n                 ";
                        }
                    }
                    if(modo==1){
                        mesa=mesa+"\n Elija una posición para jugar\n              Tu turno (X)";
                    }else{
                        mesa=mesa+"\n Elija una posición para jugar\n              Tu turno (O)";
                    }
                    /* a partir de aquí la cosa se pone buena*/ a=a;
                    
                    //guardamos el movimiento del jugador
                    if (turno%2==1-modo) {
                        pos=JOptionPane.showOptionDialog(null, mesa, "         Triqui", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, tab, tab[0]);
                        if(turno==1+modo){
                            us1=pos;
                        }
                        if(turno==3&modo==0){
                            us2=pos;
                        }
                    }else{
                        if(turno!=2-modo||nivel==0||nivel==1&modo==0){
                            do{
                            pos=(int) (Math.random()*10);
                            //if(turno==2) pos=8;
                            }while(pos>=9);
                            //System.out.println("pos tal:"+pos);
                        }
                    }
                    
//*******************************************Aquí, jugadas principales***************************************
                    
                    if(nivel==2){
                        //si elije ser jugador 2
                        if (modo==1) {

                            //si Juego en lado
                            if (mi%2==1 &turno!=1&turno%2==1) {
                                if (us1!=4 & us1!=8-mi & us1!=mi+1+mi/3%2*2 & us1!=mi-1-mi/3%2*2){
                                    if (turno==3){
                                        if ((mi+1+mi/3%2*2)%3==us1%3|(mi+1+mi/3%2*2)/3==us1/3){
                                            pos=(mi+1+mi/3%2*2);
                                        }else{
                                            pos=(mi-1-mi/3%2*2);
                                        }
                                    }else{
                                        pos=4;
                                    }
                                }else{
                                    if (us1==4) {
                                        pos=(mi+1+mi/3%2*2);
                                    }
                                    if (us1!=4&us1!=8-mi) {
                                        pos=8-mi;
                                    }
                                }
                            }


                            //Si juego en centro
                            if (mi==4&turno==3) {

                                //si juega en esquina
                                if (us1%2==0){
                                    //System.out.println("prrr");
                                    pos=8-us1;
                                 // si juega en el centro
                                }else{
                                    pos=9-us1+((8-us1)/3)%2*2;
                                }
                            }

                            //Si juego en la esquina
                            if(mi%2==0&mi!=4){

                                //usuario opuesto
                                if (turno==3) {
                                    if(us1==8-mi&turno%2==1){
                                        for (int i=0; i<9; i=i+2+i%3){
                                                if(casillas[i]==0){
                                                        pos=i;
                                                }
                                        }
                                    }
                                    //usuario contiguo
                                    if(us1%2==0&us1!=8-mi&turno%2==1){
                                        pos=8-mi;
                                    }
                                    //usuario lado
                                    if(us1%2==1&turno%2==1){
                                        pos=4;
                                    }
                                    //usuario centro
                                    if(us1==4&turno%2==1){
                                        pos=8-mi;
                                        //System.out.println("centro:"+(pos+1)+"casilla:"+casillas[pos]);
                                    }
                                }else{
                                    //System.out.println("mal");
                                    if (turno==5&us1%2==1) {
                                        for (int i = 0; i < 9; i=i+2+i%3) {
                                            if (casillas[i]==0&(casillas[1%3]!=casillas[i%3+3]&casillas[i%3+6]!=casillas[i%3]&casillas[i%3+3]!=casillas[i%3+6]|casillas[(i/3)*3]!=casillas[(i/3)*3+1]&casillas[(i/3)*3]!=casillas[(i/3)*3+2]&casillas[(i/3)*3+1]!=casillas[(i/3)*3+2])) {
                                                pos=8-i;
                                            }
                                        }
                                    }
                                    if (turno==5&us1==8-mi){
                                        for (int i=0; i<9; i=i+2+i%3){
                                            if(casillas[i]==0){
                                                pos=i;
                                            }
                                        }
                                    }
                                }
                            }

                        }else{//SI EL JUGADOR ELIGE SER 1 (O)**********************
                            if(turno==2){
                                if(us1==4){
                                    do {
                                        pos=(int) (Math.random()*10);
                                    } while (pos%2!=0|pos==4); 
                                }
                                if(us1%2==0&us1!=4){
                                    pos=4;
                                }
                                if (us1%2==1) {
                                    pos=us1+1+us1/3%2*2;
                                }
                            }
                            if (turno==4) {
                                if (us1==4) {
                                    do {
                                        pos=(int) (Math.random()*10);
                                    } while (pos%2==1|pos==9|casillas[pos]!=0);
                                }
                                if(us1%2==0&us1!=4&us2==8-us1){
                                    do {
                                        pos=(int) (Math.random()*10);
                                    } while (pos%2==0|pos==9);
                                }
                                if (us1%2==1&us2==8-us1) {
                                    pos=4;
                                }
                            }
                        }
                    }
//**************************************************************************************************************
                    
                    
//************************************AQUÍ COLOCO LAS JUGADAS POR DEFECTO******************************************
                    
                    if(nivel!=0){
                        if(turno>3+modo){//pato
                            //System.out.println("mas4");
                            for (int i = 0; i < 7; i=i+3) {
                                if (casillas[i]==casillas[i+1]&casillas[i]!=0&casillas[i+2]==0|casillas[i]==casillas[i+2]&casillas[i]!=0&casillas[i+1]==0|casillas[i+1]!=0&casillas[i+1]==casillas[i+2]&casillas[i]==0) {
                                    //gan=true;
                                    for (int l = i; l <=i+2; l++) {

                                    }
                                    if(turno%2==modo){//pato
                                        if(casillas[i]==modo|casillas[i+1]==modo){
                                          //      System.out.println("casi casi3");
                                                for (int l = i; l <=i+2; l++) {
                                                        if(casillas[l]==0){
                                                                pos=l;
                                                        }
                                                }
                                                peligro2=false;
                                        }else{
                                        //        System.out.println("joder, peligro3");
                                                fila=true;
                                        }
                                    }
                                }
                            }

                            if(fila&peligro2){
                                for (int i = 0; i < 7; i=i+3) {
                                    if (casillas[i]==casillas[i+1]&casillas[i]!=0&casillas[i+2]==0|casillas[i]==casillas[i+2]&casillas[i]!=0&casillas[i+1]==0|casillas[i+1]!=0&casillas[i+1]==casillas[i+2]&casillas[i]==0) {
                                        for (int l = i; l <=i+2; l++) {
                                            if(casillas[l]==0){
                                                pos=l;
                                      //          System.out.println("pis1");
                                            }
                                        }
                                    }
                                }
                            }

                            //columnas
                            for (int i = 0; i < 3; i++) {
                                if (casillas[i]==casillas[i+3]&casillas[i]!=0&casillas[i+6]==0|casillas[i]==casillas[i+6]&casillas[i]!=0&casillas[i+3]==0|casillas[i+3]!=0&casillas[i+3]==casillas[i+6]&casillas[i]==0) {
                                    if(turno%2==modo){//pato
                                        if(casillas[i]==modo|casillas[i+3]==modo){
                                     //        System.out.println("casi casi3");
                                            for (int l = i; l <=i+6; l=l+3) {
                                                if(casillas[l]==0){
                                                    pos=l;
                                                }
                                            }
                                            peligro2=false;
                                        }else{
                                            columna=true;
                                  //          System.out.println("joder, peligro3"+columna+peligro2);
                                        }
                                    }
                                }
                            }

                            if(columna&peligro2){
                                for (int i = 0; i < 3; i++) {
                                    if (casillas[i]==casillas[i+3]&casillas[i]!=0&casillas[i+6]==0|casillas[i]==casillas[i+6]&casillas[i]!=0&casillas[i+3]==0|casillas[i+3]!=0&casillas[i+3]==casillas[i+6]&casillas[i]==0) {
                                        for (int l = i; l <=i+6; l=l+3) {
                                            if(casillas[l]==0){
                                                pos=l;
                                //                System.out.println("pis2"+pos);
                                            }
                                        }
                                    }
                                }
                            }
                            //diagonal
                            for (int i = 0; i < 3; i=i+2) {
                                if (casillas[i]==casillas[4]&casillas[i]!=0&casillas[8-i]==0|casillas[8-i]==casillas[i]&casillas[i]!=0&casillas[4]==0|casillas[4]!=0&casillas[4]==casillas[8-i]&casillas[i]==0) {
                                    if(turno%2==modo){
                                        if(casillas[i]==modo|casillas[4]==modo){
                              //              System.out.println("casi casi3");
                                            for (int l = i; l <=8-i; l=l+4-i) {
                                                if(casillas[l]==0){
                                                    pos=l;
                                                }
                                            }
                                            peligro2=false;
                                        }else{
                            //                System.out.println("joder, peligro3");
                                            diagonal=true;
                                        }
                                    }
                                }
                            }

                            if(diagonal&peligro2){
                                for (int i = 0; i < 3; i=i+2) {
                                    if (casillas[i]==casillas[4]&casillas[i]!=0&casillas[8-i]==0|casillas[8-i]==casillas[i]&casillas[i]!=0&casillas[4]==0|casillas[4]!=0&casillas[4]==casillas[8-i]&casillas[i]==0) {
                                        for (int l = i; l <=8-i; l=l+4-i) {
                                            if(casillas[l]==0){
                                                pos=l;
                          //                      System.out.println("pis3");
                                            }
                                        }
                                    }
                                }
                            }

                        }
                        if(turno==9&modo==1){
                            for (int i = 0; i < 9; i++) {
                                if (casillas[i]==0) {
                        //            System.out.println("coros"+i);
                                    pos=i;
                                }
                            }
                        }
                    }
                    
                    
//**********************TERMINAN JUGADAS POR DEFECTO*************aquí sigue****************************************************
                    if (casillas[pos]==0) {
                        if(turno%2==1){
                            casillas[pos]=1;
                            tablero[pos]="O";
                        }else{
                            casillas[pos]=2;
                            tablero[pos]="X";
                        }
                    }else{
                        turno--;
                  //      System.out.println("error");
                        if (turno%2==modo
                                ) {
                        JOptionPane.showMessageDialog(null, "Esa casilla ya ha sido usada, elija otra", "Advertencia, Triqui", 2);
                        }
                    }
                    
                    for (int i = 0; i < 7; i=i+3) {
                        if (casillas[i]==casillas[i+1]&&casillas[i]==casillas[i+2]&&casillas[i]!=0) {
                            ganador=true;
                            if(casillas[i]==2-modo){
                                jug="¡Felicidades!\nDe Fracasos está hecho el éxito\nEl ganador ha sido el Sistema";
                                jug2="\n            Uy! te ganaron";
                            }else{
                                jug="                              ¡OH MY GOD!\n"
                                + "                 Has logrado lo imposible\n"
                            + "                Le has ganado al sistema\n                             Eres historia";
                                jug2="\n       No puede ser... ganaste...";
                            }
                        }
                        
                    }
                    for (int i = 0; i < 3; i++) {
                        if (casillas[i]==casillas[i+3]&&casillas[i]==casillas[i+6]&&casillas[i]!=0) {
                            ganador=true;
                            if(casillas[i]==2-modo){
                                jug="¡Felicidades!\nDe Fracasos está hecho el éxito\nEl ganador ha sido el Sistema";
                                jug2="\n            Uy! te ganaron";
                            }else{
                                jug="                              ¡OH MY GOD!\n"
                                + "                 Has logrado lo imposible\n"
                            + "                Le has ganado al sistema\n                             Eres historia";
                                jug2="\n       No puede ser... ganaste...";
                            }
                        }
                    }
                    for (int i = 0; i < 3; i=i+2) {
                        if (casillas[i]==casillas[4]&&casillas[8-i]==casillas[i]&&casillas[i]!=0) {
                            ganador=true;
                            if(casillas[i]==2-modo){
                                jug="¡Felicidades!\nDe Fracasos está hecho el éxito\nEl ganador ha sido el Sistema";
                                jug2="\n            Uy! te ganaron";
                            }else{
                                jug="                              ¡OH MY GOD!\n"
                                + "                 Has logrado lo imposible\n"
                            + "                Le has ganado al sistema\n                             Eres historia";
                                jug2="\n       No puede ser... ganaste...";
                            }
                        }
                    }
                    
                }while(!ganador&&turno<9);
                //System.out.println("fin"+tablero[pos]);
                mesa="                 ";
                for (int i = 1; i <=9; i++) {
                    mesa=mesa+"| "+tablero[i-1]+" ";
                    if (i%3==0) {
                        mesa =mesa+"|\n                 ";
                    }
                }
                if (ganador) {
                    mesa=mesa+jug2;
                }else{
                    mesa=mesa+"\n          Jum... te salvaste";
                }
                JOptionPane.showMessageDialog(null, mesa, "         triqui", 1);
                if(ganador){
                    JOptionPane.showMessageDialog(null, jug, "         Triqui", -1);
                }else{
                    JOptionPane.showMessageDialog(null, "   Felicidades, has contado con suerte\n"
                            + "     "
                            + ""
                            + "       Ha resultado en empate", "         triqui", 1);
                }
                 break;
            }
        resp = JOptionPane.showConfirmDialog(null, "Desea salir del juego?", "Salida", JOptionPane.YES_NO_OPTION, 2);
        
        }while(resp==1&&a!=3);
        JOptionPane.showMessageDialog(null,"GRACIAS POR PARTICIPAR" );
    }
    
}
