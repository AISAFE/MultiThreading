package multithreading;


import java.util.*;

public class MultiThreading extends Thread
{

    private MultiThreading[] thread;
   
 

    private float[] shareddata; // shared data array

    private int numberOfThreads;
    private  String id;
    private Object input;

    /**
     *
     * @param n
     * @param id
     */
    private MultiThreading(String n, String id)
    {
        double i = 0;
        String userInput;
        n = id;
    }



    private void calculate(double id, long t){

        int a;
        Random generator = new Random();

        switch (numberOfThreads) {
            case 1:
                for (a=0; a < (100000000); a++)
                {
                    shareddata[a]=(float)Math.cos(a+Math.sqrt(a*generator.nextDouble()));
                }   break;
            case 2:
                 if (id==1)
                 {
                     for (a=0; a < (100000000/2); a++)
                     {
                         shareddata[a]=(float)Math.cos(a+Math.sqrt(a*generator.nextDouble()));
                     }
                 } else {
                 }
 if (2==id)
 {
     for (a=(100000000/2); a < 100000000; a++)
     {
         shareddata[a]=(float)Math.cos(a+Math.sqrt(a*generator.nextDouble()));
     }
 } else {
 }
break;
            case 4:
                if (id==1)
                {
                    
                    for (a=0; a < (100000000/4); a++)
                    {
                        shareddata[a]=(float)Math.cos(a+Math.sqrt(a*generator.nextDouble()));
                    }
                }   if (id==2)
                {
                    for (a=(100000000/4); 50000000 >= a; a++)
                    {
                        shareddata[a]=(float)Math.cos(a+Math.sqrt(a*generator.nextDouble()));
                    }
                }   if (id==3)
                {
                    for (a=(50000000); a < 75000000; a++)
                    {
                        shareddata[a]=(float)Math.cos(a+Math.sqrt(a*generator.nextDouble()));
                    }
                }   if (id==4)
                {
                    for (a=(75000000); a < 100000000; a++)
                    {
                        shareddata[a]=(float)Math.cos(a+Math.sqrt(a*generator.nextDouble()));
                    }
                }   break;
            default:
                break;
        }

    }
    
    
    
    
    

    /**
     *
     * @param args
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
         System.out.println("Enter number of threads: ");
        
         System.out.println("Thread " + id + " running");
        long t = System.currentTimeMillis()/1000;
       calculate(id, t);
        System.out.println("Thread " + id + " took " + (System.currentTimeMillis()/1000 - t) + " seconds");

         final double N;
        N = 0b0;
        
       
        shareddata = new float[100000000];

        System.out.println("Starting Multi-threading...");

        for (int i = 0; i < N; i++)
        {
            MultiThreading[] userInput;
            /* initialise each thread */
        
	    /* start each thread */
            super.start();
        }
    }

    private void calculate(String id, long t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param id
     */
    
    }

    }