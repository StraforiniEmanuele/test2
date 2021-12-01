package com.company;


public class Calcolo {

    private Integer uno, due, tre, quattro, cinque, sei, sette, otto, nove;

    public Calcolo() {
    }

    public Calcolo(Integer uno, Integer due, Integer tre, Integer quattro, Integer cinque, Integer sei, Integer sette, Integer otto, Integer nove) {
        this.uno = uno;
        this.due = due;
        this.tre = tre;
        this.quattro = quattro;
        this.cinque = cinque;
        this.sei = sei;
        this.sette = sette;
        this.otto = otto;
        this.nove = nove;
    }

    public int calcolo(int x){
        int y = 0;
        if(x%2==0){
            x/=2;
            System.out.println(x);
        }else if(x%2!=0){
            x*=3;
            x+=1;
            System.out.println(x);
        }
        if(x!=1){
            Character numeroIniziale = String.valueOf(x).charAt(0);
            switch (numeroIniziale){
                case '1':
                    uno+=1;
                    break;
                case '2':
                    due+=1;
                    break;
                case '3':
                    tre+=1;
                    break;
                case '4':
                    quattro+=1;
                    break;
                case '5':
                    cinque+=1;
                    break;
                case '6':
                    sei+=1;
                    break;
                case '7':
                    sette+=1;
                    break;
                case '8':
                    otto+=1;
                    break;
                case '9':
                    nove+=1;
                    break;
            }
            calcolo(x);
        }
        if(x==2){
            System.out.println("----------------------------");
        }
        return y;
    }

    public void alberoDiNatale(int l){
        for (int i = 0; i < l; i++){

            switch (i){
                case 0:
                case 6:
                    System.out.println("     *     ");
                    break;
                case 1:

                case 7:
                case 8:
                    System.out.println("    ***    ");
                    break;
                case 2:
                    System.out.println("   *****   ");
                    break;
                case 3:
                    System.out.println("  *******  ");
                    break;
                case 4:
                    System.out.println(" ********* ");
                    break;
                case 5:
                case 9:
                    System.out.println("***********");
                    break;


            }
        }
    }

    @Override
    public String toString() {
        return "Calcolo{" +
                "uno=" + uno +
                ", due=" + due +
                ", tre=" + tre +
                ", quattro=" + quattro +
                ", cinque=" + cinque +
                ", sei=" + sei +
                ", sette=" + sette +
                ", otto=" + otto +
                ", nove=" + nove +
                '}';
    }
}
