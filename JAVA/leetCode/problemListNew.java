
        int count = 0;
        int stoneLength = stones.length();
        int i = 0;
        while( i < jewels.length()){
            for(int j=0; j < stoneLength; j++){
                if(jewels.charAt(i) == stones.charAt(j)){
                    count++;
                }
            }
            i++;
        }
        return count;