class PascalsTriangleTwo {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            List<Integer> key = new ArrayList<>();
            key.add(1);
            return key;
    
        }
        else if (rowIndex == 1) {
            List<Integer> key = new ArrayList<>();
            key.add(1);
            key.add(1);
            return key;
        }

        else if (rowIndex == 2) {
            List<Integer> key = new ArrayList<>();
            key.add(1);
            key.add(2);
            key.add(1);
            return key;
        }


        ArrayList<Integer> answer = new ArrayList<>();
        List<Integer> prev = (ArrayList) getRow(rowIndex - 1);
        System.out.println(prev);
        for (int i = 0; i < prev.size() + 1; i++) {
            answer.add(add(prev, i));
        }

        return answer;
    }

    public int add(List<Integer> referenceArray, int startIndex) {
        if (startIndex == 0) {return 1;}
        else if (startIndex == referenceArray.size()) {return 1;}
        else {return referenceArray.get(startIndex-1) + referenceArray.get(startIndex);}
    }
}
