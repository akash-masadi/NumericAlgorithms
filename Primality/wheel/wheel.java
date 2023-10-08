// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class wheel {
    public static void main(String[] args) 
    {
        long n=10000000019l;
        long k=(n%30);

        long startSwitch=System.currentTimeMillis(); //switch starting time in milli
        long startNanoSwitch=System.nanoTime(); //switch starting time in nano

        switch((int)k)
        {
            case 7:
            case 11:
            case 13:
            case 17:
            case 19:
            case 23:
            case 29:
            System.out.println("PRIME");
            break;
            default:System.out.println("NOT");
        }
        long endSwitch=System.currentTimeMillis();      // switch end time in milli
        long endNanoSwitch=System.nanoTime(); // switch end time in nano

        System.out.println((endSwitch-startSwitch)/1000.0);
        System.out.println(endNanoSwitch-startNanoSwitch);

        long startif=System.currentTimeMillis(); // if start time in milli
        long startNanoif=System.nanoTime();  //if start in nano

        if(k==7 || k==11 || k==13 || k==17 || k==19 || k==23  || k==29)
            System.out.println("PRIME");
        else
            System.out.println("NOT");

        long endif=System.currentTimeMillis();
        long endNanoif=System.nanoTime();

        System.out.println((endif-startif)/1000.0); //if end time in milli
        System.out.println(endNanoif-startNanoif); //if end time in nano
    }
}