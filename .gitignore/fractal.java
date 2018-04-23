//Sean Mann and Emmeline Pearson 
//April 2018 
//EECS338 

NUM_CORES = 5; //set number of cores 
NUM_THREADS = 5; //set number of threads 
//^Use the same number of each for optimal computation time but could be anything

//global area variable declaration 
float totalAreas = 0; 

//global numTraingles - to find max number of triangles 
int numTriangles; 

public class fractal { 
    public static void main(String args[]){
        //input argument for number of iterations to run
        iter = Integer.parseInt(args[0]);
        
       Multi3 m1 = new Multi3();
       
        for(int i = 0; i< iter; i++){
            //create one child tread per iteration
            Thread i = new Thread(m1); 
            i.start(); //starts the thread running - same as calling the child function
        }
        
        //join threads
        pthread join; 
        
        
        
        //compute area 
        float area = 0; 
        area = totalAreas / iter; 
        return area; //return area
        
        //num triangles 
        return numTriangles; 
        
        //plot figure 
        plotFractal(iter); 
        

    }
    
    
}

public start(){ //child used to calculate area for a iter
    int triangels = 0; //number of triagles in fractal 
    float tempArea = 0; //smallest triangle area for this iteration
    
    //store all the vertex values 
    double[] vertexes = new double[size]; 
    //^size will correspond to the iteration number and depends on which iteration this child is running
    
    //calculate all the vertex values 
    //will determine the method to do this at a later time
    
    
    //calculate the number of triangels 
    triangles = 12; //will actually be a different value
    
    if (traingles > numTraingles ){
        //critical section 
        numTrianges = triangles; 
    }
    
    //calculate the area 
    tempArea = (1/2) * base * heihgt; 
    //critical section 
    totalAreas = totalAreas + tempArea; 
      
    
}
