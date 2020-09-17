class Solution {
    public boolean isRobotBounded(String instructions) {
        int[] coordinates = new int[]{0,0};
        char direction = 'n';        
        for(int i = 0; i < instructions.length(); i++){
            if(instructions.charAt(i) == 'G'){
                coordinates = moveStraight(direction, coordinates);
            } else if(instructions.charAt(i) == 'L'){
                direction = turnLeft(direction);
            } else if(instructions.charAt(i) == 'R'){
                direction = turnRight(direction);   
            }
        }
        if(direction != 'n' || (coordinates[0] == 0 && coordinates[1] == 0))
            return true;
        else return false;
   
        
    }
    private int north(int[] coordinates){
        return coordinates[1] += 1;
    }
    private int south(int[] coordinates){
        return coordinates[1] -= 1;
    }
    private int west(int[] coordinates){
        return coordinates[0] -= 1;
    }
    private int east(int[] coordinates){
        return coordinates[0] += 1;
    }
    private char turnLeft(char direction){
        char ans = ' ';
        if(direction == 'n'){
            ans = 'w';
        } else if(direction == 'w'){    
            ans = 's';
        } else if(direction == 's'){
            ans = 'e';
        } else if(direction == 'e'){
            ans = 'n';
        }
        return ans;
    }
    private char turnRight(char direction){
        switch(direction){
            case 'n': 
                direction = 'e';
                break;
            case 'e':
                direction = 's';
                break;
            case 's': 
                direction = 'w';
                break;
            case 'w':
                direction = 'n';
                break;
        }
        return direction;
    }
    private int[] moveStraight(char moveDirection, int[] coordinates){
        switch(moveDirection){
            case 'n':
                north(coordinates);
                break;
            case 'w':
                west(coordinates);
                break;
            case 's':
                south(coordinates);
                break;
            case 'e':
                east(coordinates);
                break;
        }
        return coordinates;
    }
}