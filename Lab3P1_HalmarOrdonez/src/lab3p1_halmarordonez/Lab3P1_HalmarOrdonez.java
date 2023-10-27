
package lab3p1_halmarordonez;
import java.util.Scanner;

public class Lab3P1_HalmarOrdonez {


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char syn = 's';
        while(syn == 's' || syn == 'S'){
            System.out.println("Opciones:");
            System.out.println("1. Sucesiones y mas sucesiones");
            System.out.println("2. Pocket Monsters");
            System.out.println("3. Asterisco en casa");
            System.out.print("Ingrese su opcion: ");
            int opc = read.nextInt();
            switch(opc){
                case 1->{
                    int inv = 1;
                    while(inv==1){
                        System.out.println();
                        System.out.println("Sucesiones y mas sucesiones: ");
                        System.out.print("Ingrese la diferencia: ");
                        int dif = read.nextInt();
                        int dif2 = dif;
                        System.out.print("Ingrese el numero inicial: ");
                        int ini = read.nextInt();
                        int ini2 = ini;
                        System.out.print("Cantidad de numeros: ");
                        int cant = read.nextInt();
                        int ex = 0;
                        if(ini>=0 && dif>0 && cant>=0){
                            for(int ct=1;ct<cant;ct++){
                                System.out.print(ini + ", ");
                                ini = ini+dif+ex;
                                ex++;
                            }
                            ex = 0;
                            System.out.println(ini);
                            System.out.print("Que numero desea ver mas adelante en la sucesion?: ");
                            int numad = read.nextInt();
                            for(int ct2=1;ct2<numad;ct2++){
                                ini2 = ini2+dif2+ex;
                                ex++;
                            }
                            System.out.println("El numero seria: " + ini2);
                            inv = 0;
                        }
                        else{
                            System.out.println("No se pueden usar numero negativos");
                            inv = 1;
                        }
                    }
                }
                case 2->{
                    System.out.println();
                    System.out.println("Pocket monsters: ");
                    System.out.println("Que modo de pelea deasea: ");
                    System.out.println("1. Hasta la muerte por rondas");
                    System.out.println("2. Por rondas");
                    System.out.print("Ingrese su opcion: ");
                    int mode = read.nextInt();
                    System.out.println();
                    int rd=1;
                    
                    //estadisticas de pokemon
                    double sylhp = 280, gyahp = 300, girhp = 300, drahp = 250; //hp
                    double sylatk = 80, gyaatk = 50, giratk = 70, draatk = 75;//ataque
                    double syldef = 0.15, gyadef = 0.10, girdef = 0.25, dradef = 0.20;//defensa
                    System.out.println("Estadisticas de los pokemones");
                    System.out.println("Sylveon: Vida:"+sylhp+" Ataque:"+sylatk+" Defensa:"+syldef);
                    System.out.println("Gyarados: Vida:"+gyahp+" Ataque:"+gyaatk+" Defensa:"+gyadef);
                    System.out.println("Giratina: Vida:"+girhp+" Ataque:"+giratk+" Defensa:"+girdef);
                    System.out.println("Dragonite: Vida:"+drahp+" Ataque:"+draatk+" Defensa:"+dradef);
                    System.out.println();
                    System.out.println("Ingrese una pelea predeterminada");
                    System.out.println("1. Sylveon vs Dragonite");
                    System.out.println("2. Gyarados vs Giratina");
                    System.out.println("3. Dragonite vs Giratina");
                    System.out.println("4. Giratina vs Sylveon");
                    System.out.print("Ingrese su opcion: ");
                    int pelea = read.nextInt();
                    switch(pelea){
                        case 1->{
                            double hp1=sylhp, hp2=drahp, atk1=sylatk, atk2=draatk, def1=syldef, def2=dradef;
                            switch(mode){
                                case 1->{
                                    System.out.println("Pelea hasta la muerta");
                                    while(hp1>0 && hp2>0){
                                        System.out.println("---------------Ronda "+rd+"---------------");
                                        System.out.println("Vida de pokemon 1: "+hp1);
                                        System.out.println("Vida de pokemon 2: "+hp2);
                                        hp1=hp1-(atk2-(atk2*def1));
                                        hp2=hp2-(atk1-(atk1*def2));
                                        if(hp1<0){
                                            hp1=0;
                                        }if (hp2<0){
                                            hp2=0;
                                        }    
                                        System.out.println();
                                        System.out.println("Pokemon 1 ha atacado!!!");
                                        System.out.println("Pokemon 2 ha atacado!!!");
                                        System.out.println("Vide de pokemon 1: "+hp1);
                                        System.out.println("Vida de pokemon 2: "+hp2);
                                        rd++;
                                    }    
                                }
                                case 2->{
                                    System.out.println("Pelea por rondas");
                                    System.out.print("Cantidad de rondas(1-10): ");
                                    int rds = read.nextInt();
                                    if(rds<11 && rds>0){
                                        for(int ct=1; ct<=rds;ct++){
                                            if(hp1>0 && hp2>0){
                                                System.out.println("---------------Ronda "+rd+"---------------");
                                                System.out.println("Vida de pokemon 1: "+hp1);
                                                System.out.println("Vida de pokemon 2: "+hp2);
                                                hp1=hp1-(atk2-(atk2*def1));
                                                hp2=hp2-(atk1-(atk1*def2));
                                                if(hp1<0){
                                                    hp1=0;
                                                }if (hp2<0){
                                                    hp2=0;
                                                }    
                                                System.out.println();
                                                System.out.println("Pokemon 1 ha atacado!!!");
                                                System.out.println("Pokemon 2 ha atacado!!!");
                                                System.out.println("Vide de pokemon 1: "+hp1);
                                                System.out.println("Vida de pokemon 2: "+hp2);
                                                rd++;
                                                System.out.println();
                                            }else if(hp1<=0){
                                                System.out.println("Pokemon 1 no ha podido terminar las rondas");
                                                ct=rds;
                                            }else{
                                                System.out.println("Pokemon 2 no ha podido terminar las rondas");
                                                ct=rds;
                                            }
                                        }
                                        
                                    }else{
                                        System.out.println("Cantidad de rounds invalido");
                                    }
                                }
                            }
                        }    
                        case 2->{
                            double hp1=gyahp, hp2=girhp, atk1=gyaatk, atk2=giratk, def1=gyadef, def2=girdef;
                                switch(mode){
                                case 1->{
                                    System.out.println("Pelea hasta la muerta");
                                    while(hp1>0 && hp2>0){
                                        System.out.println("---------------Ronda "+rd+"---------------");
                                        System.out.println("Vida de pokemon 1: "+hp1);
                                        System.out.println("Vida de pokemon 2: "+hp2);
                                        hp1=hp1-(atk2-(atk2*def1));
                                        hp2=hp2-(atk1-(atk1*def2));
                                        if(hp1<0){
                                            hp1=0;
                                        }if (hp2<0){
                                            hp2=0;
                                        }    
                                        System.out.println();
                                        System.out.println("Pokemon 1 ha atacado!!!");
                                        System.out.println("Pokemon 2 ha atacado!!!");
                                        System.out.println("Vide de pokemon 1: "+hp1);
                                        System.out.println("Vida de pokemon 2: "+hp2);
                                        rd++;
                                    }    
                                }
                                case 2->{
                                    System.out.println("Pelea por rondas");
                                    System.out.print("Cantidad de rondas(1-10): ");
                                    int rds = read.nextInt();
                                    if(rds<11 && rds>0){
                                        for(int ct=1; ct<=rds;ct++){
                                            if(hp1>0 && hp2>0){
                                                System.out.println("---------------Ronda "+rd+"---------------");
                                                System.out.println("Vida de pokemon 1: "+hp1);
                                                System.out.println("Vida de pokemon 2: "+hp2);
                                                hp1=hp1-(atk2-(atk2*def1));
                                                hp2=hp2-(atk1-(atk1*def2));
                                                if(hp1<0){
                                                    hp1=0;
                                                }if (hp2<0){
                                                    hp2=0;
                                                }    
                                                System.out.println();
                                                System.out.println("Pokemon 1 ha atacado!!!");
                                                System.out.println("Pokemon 2 ha atacado!!!");
                                                System.out.println("Vide de pokemon 1: "+hp1);
                                                System.out.println("Vida de pokemon 2: "+hp2);
                                                rd++;
                                                System.out.println();
                                            }else if(hp1<=0){
                                                System.out.println("Pokemon 1 no ha podido terminar las rondas");
                                                ct=rds;
                                            }else{
                                                System.out.println("Pokemon 2 no ha podido terminar las rondas");
                                                ct=rds;
                                            }
                                        }
                                        
                                    }else{
                                        System.out.println("Cantidad de rounds invalido");
                                    }
                                }
                            }
                        }
                        case 3->{
                            double hp1=drahp, hp2=girhp, atk1=draatk, atk2=giratk, def1=dradef, def2=girdef;
                                switch(mode){
                                case 1->{
                                    System.out.println("Pelea hasta la muerta");
                                    while(hp1>0 && hp2>0){
                                        System.out.println("---------------Ronda "+rd+"---------------");
                                        System.out.println("Vida de pokemon 1: "+hp1);
                                        System.out.println("Vida de pokemon 2: "+hp2);
                                        hp1=hp1-(atk2-(atk2*def1));
                                        hp2=hp2-(atk1-(atk1*def2));
                                        if(hp1<0){
                                            hp1=0;
                                        }if (hp2<0){
                                            hp2=0;
                                        }    
                                        System.out.println();
                                        System.out.println("Pokemon 1 ha atacado!!!");
                                        System.out.println("Pokemon 2 ha atacado!!!");
                                        System.out.println("Vide de pokemon 1: "+hp1);
                                        System.out.println("Vida de pokemon 2: "+hp2);
                                        rd++;
                                    }    
                                }
                                case 2->{
                                    System.out.println("Pelea por rondas");
                                    System.out.print("Cantidad de rondas(1-10): ");
                                    int rds = read.nextInt();
                                    if(rds<11 && rds>0){
                                        for(int ct=1; ct<=rds;ct++){
                                            if(hp1>0 && hp2>0){
                                                System.out.println("---------------Ronda "+rd+"---------------");
                                                System.out.println("Vida de pokemon 1: "+hp1);
                                                System.out.println("Vida de pokemon 2: "+hp2);
                                                hp1=hp1-(atk2-(atk2*def1));
                                                hp2=hp2-(atk1-(atk1*def2));
                                                if(hp1<0){
                                                    hp1=0;
                                                }if (hp2<0){
                                                    hp2=0;
                                                }    
                                                System.out.println();
                                                System.out.println("Pokemon 1 ha atacado!!!");
                                                System.out.println("Pokemon 2 ha atacado!!!");
                                                System.out.println("Vide de pokemon 1: "+hp1);
                                                System.out.println("Vida de pokemon 2: "+hp2);
                                                rd++;
                                                System.out.println();
                                            }else if(hp1<=0){
                                                System.out.println("Pokemon 1 no ha podido terminar las rondas");
                                                ct=rds;
                                            }else{
                                                System.out.println("Pokemon 2 no ha podido terminar las rondas");
                                                ct=rds;
                                            }
                                        }
                                        
                                    }else{
                                        System.out.println("Cantidad de rounds invalido");
                                    }
                                }
                            }
                        }
                        case 4->{
                            double hp1=girhp, hp2=sylhp, atk1=giratk, atk2=sylatk, def1=girdef, def2=syldef;
                                switch(mode){
                                case 1->{
                                    System.out.println("Pelea hasta la muerta");
                                    while(hp1>0 && hp2>0){
                                        System.out.println("---------------Ronda "+rd+"---------------");
                                        System.out.println("Vida de pokemon 1: "+hp1);
                                        System.out.println("Vida de pokemon 2: "+hp2);
                                        hp1=hp1-(atk2-(atk2*def1));
                                        hp2=hp2-(atk1-(atk1*def2));
                                        if(hp1<0){
                                            hp1=0;
                                        }if (hp2<0){
                                            hp2=0;
                                        }    
                                        System.out.println();
                                        System.out.println("Pokemon 1 ha atacado!!!");
                                        System.out.println("Pokemon 2 ha atacado!!!");
                                        System.out.println("Vide de pokemon 1: "+hp1);
                                        System.out.println("Vida de pokemon 2: "+hp2);
                                        rd++;
                                    }    
                                }
                                case 2->{
                                    System.out.println("Pelea por rondas");
                                    System.out.print("Cantidad de rondas(1-10): ");
                                    int rds = read.nextInt();
                                    if(rds<11 && rds>0){
                                        for(int ct=1; ct<=rds;ct++){
                                            if(hp1>0 && hp2>0){
                                                System.out.println("---------------Ronda "+rd+"---------------");
                                                System.out.println("Vida de pokemon 1: "+hp1);
                                                System.out.println("Vida de pokemon 2: "+hp2);
                                                hp1=hp1-(atk2-(atk2*def1));
                                                hp2=hp2-(atk1-(atk1*def2));
                                                if(hp1<0){
                                                    hp1=0;
                                                }if (hp2<0){
                                                    hp2=0;
                                                }    
                                                System.out.println();
                                                System.out.println("Pokemon 1 ha atacado!!!");
                                                System.out.println("Pokemon 2 ha atacado!!!");
                                                System.out.println("Vide de pokemon 1: "+hp1);
                                                System.out.println("Vida de pokemon 2: "+hp2);
                                                rd++;
                                                System.out.println();
                                            }else if(hp1<=0){
                                                System.out.println("Pokemon 1 no ha podido terminar las rondas");
                                                ct=rds;
                                            }else{
                                                System.out.println("Pokemon 2 no ha podido terminar las rondas");
                                                ct=rds;
                                            }
                                        }
                                        
                                    }else{
                                        System.out.println("Cantidad de rounds invalido");
                                    }
                                }
                            }
                        }
                        default->{
                            System.out.println("Opcion invalida");
                        }
                    }
                }
                case 3->{
                    System.out.println();
                    System.out.println("Asterisco en casa");
                    int rep=0;
                    while(rep==0){
                        System.out.print("Ingrese un numero impar(Minimo 7): ");
                        int num = read.nextInt();
                        if(num<7 || num%2==0){
                            System.out.println("Numero invalido, vuelvalo a intentar");
                            rep = 0;
                        }else{
                            for(int ct=1;ct<=num;ct++){
                                for(int ctd=1;ctd<=num;ctd++){
                                    if(ct==1 || ct==num || ctd==1 || ctd==num){
                                        System.out.print(" * ");
                                    }
                                    else if(ctd==(num/2+1)){
                                        System.out.print(" | ");
                                    }
                                    else if(ct==ctd || ct+ctd==num+1){
                                        System.out.print(" > ");
                                    }
                                    else{
                                        System.out.print("   ");
                                    }
                                }
                                System.out.println();
                            }
                            rep=1;
                        }
                    }        
                }
                default->{
                    System.out.println();
                    System.out.println("Opcion invalida");
                }
            }
            System.out.println();
            System.out.print("Desea regresar al menu inicial(s/n)?: ");
            syn = read.next().charAt(0);
        }
    
    }
}
