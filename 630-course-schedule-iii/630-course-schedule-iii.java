class Solution {
    public int scheduleCourse(int[][] courses) {

        // sort array according to deadline. We gonna do greedy stuff
        Arrays.sort(courses, (a,b) -> a[1] - b[1]);
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> b - a);
        
        
        int lastDateSum = 0;
        
        for(int[] course : courses) {
            
            // if condition satisfies
            if(lastDateSum + course[0] <= course[1]) {
                pq.offer(course[0]);
                lastDateSum = lastDateSum + course[0];
               
            // can we replace the course with max duration, with this new course ?
            } else if(!pq.isEmpty() && pq.peek() > course[0]) {
                lastDateSum = lastDateSum - pq.poll();
                pq.offer(course[0]);
                lastDateSum = lastDateSum + course[0];
            }
        }
        
        return pq.size();
        
    }
}