class Solution {
    public int numRescueBoats(int[] people, int limit) {
    int len  = people.length ; 
    int light  =  0 ; 
    Arrays.sort(people) ; 
    int heavy  = len - 1 ;
    int boat  = 0   ; 
    while(light<=heavy)
    {
        if(people[light]+people[heavy]<=limit)
        {
           boat++ ;
           light++ ;
           heavy-- ;
        }
        else 
        {
            boat++ ;
            heavy-- ;
        }
    }
    return boat  ; 
    }
}