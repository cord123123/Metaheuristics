public class Problem {
    Place [] places;
    String name;
    int size;

    private void calculatePaths(){
        for(int i=0; i<size;i++)
            for(int j=i;j<size;j++){
                if(i==j) places[i].paths[i]=0;
                else{
                    double temp = places[i].pathLength(places[j]);
                    places[j].paths[i]=temp;
                    places[i].paths[j]=temp;
                }
            }
    }

}
