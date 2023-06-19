class Solution {
    public List<Integer> getRow(int ai) {
			List<ArrayList<Integer>> list= new ArrayList<>();
		for(int i=0;i<50;i++)
		{
			list.add(new ArrayList<>());
		}
		long c=1;
		
		for(int i=0;i<list.size();i++)
		{
			for(int j=0;j<i+1;j++)
			{
				if(i==0||j==0)
				{
					c=1;
					list.get(i).add((int)c);
				}
				else
				{
					c=c*(i-j+1)/j;
					list.get(i).add((int)c);
				}
			}
		}
		return list.get(ai);
        
    }
}