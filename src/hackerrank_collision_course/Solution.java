package hackerrank_collision_course;

public class Solution {
    /**
     There are n particles numbered from 0 to n − 1 lined up from smallest to largest ID along the x-axis.
     The particles are all released simultaneously. Once released, each particle travels indefinitely in a straight line along the positive x-axis at a speed. When two particles collide, the faster particle moves through
     the slower particle and they both continue moving without changing speed or direction. Given a list of particle speeds for particles arranged left to right by position, determine the number of collisions that
     occur with the particle at index pos.
     For example, assume there are n=2 particles, p[0] and p[1], located at positions 0 and 1 at time t = 0. The particle p[0] is traveling to the right at speed[0] = 2 units velocity and particle pos[1] is traveling at
     speed[1] = 1 unit velocity per unit of time. At time t = 1, p[0] has moved to position 0 + 2 = 2, and p[1] is at position 1 + 1 = 2 on the x-axis. Since they both occupy the same position, they have collided at
     time t = 1. At time t = 2, the particle p[0] is at position 2 + 2 = 4, and p[1] is at 2 + 1 = 3 at time t = 2. Since p[0] is moving faster than p[1], and is now ahead of p[1] on the x-axis, they will never collide again.
     In this case, there is 1 collision.
     Function Description
     Complete the function collision in the editor below. The function must return the number of collisions occurring with particle pos.
     collision has the following parameter(s):
     speed[speed[0],...speed[n-1]]: an array of speed[i] indicating speed of particle i.
     pos: index of the particle for which to count collisions
     Constraints
     1 ≤ n ≤ 10
     1 ≤ speed[i] ≤ 10
     0 ≤ pos < n
     */
    public static int solution(int[] speed, int pos){
        int sol = 0;

        for(int i = 0; i < speed.length ; i++){
            if ( i < pos && speed[i] > speed[pos] ) {
                sol = sol + 1;
            }
            if (i > pos && speed[pos] > speed[i]) {
                sol = sol +1;
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        int[] array = {6, 6, 1, 3, 4, 6, 8};
        int pos1 = 2;
        int [] array2 = {8, 3, 6, 3, 2, 2, 4, 8, 1, 6};
        int pos2 = 7;
        int [] array3 = {1, 3, 7, 4, 6, 4};
        int pos3 = 3;
        System.out.println(solution(array3, pos3));
    }
}
