class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int len  =  people.length ;  
        Arrays.sort(people) ; 
        int light  = 0  ; 
        int heavy  = len-1 ; 
        int boat  = 0  ;   
        while(light<heavy)
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
        if(light==heavy)
        {
            boat++ ;

        }
        return boat ; 
    }
}