package OOP;

public class TestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Element hydrogen = new Element("hydrogen","H",1.008,1,1);
		Element helium = new Element("helium","He",4.0026,1,18);
		Element lithium = new Element("lithium","Li",6.94,2,1);
		Element beryllium = new Element("beryllium","Be",9.0122,2,2);

		Element[]chemicals=new Element[4];
		chemicals[0]=hydrogen;
		System.out.println(chemicals[0].getSymbol());
		
		Element[]chemicalTest= {hydrogen,helium,lithium,beryllium};
		double totalWeight=0.0;
		for(int i=0;i<chemicalTest.length;i++) {
			totalWeight+=chemicalTest[i].getWeight();
			
		}
		double averageWeight=totalWeight/chemicalTest.length;
		System.out.println("Average weight of the chemicals in the array is "+ averageWeight);

		
		
		Element[]chemicalTest2={
				new Element("hydrogen","H",1.008,1,1),
				new Element("helium","He",4.0026,1,18),
				new Element("lithium","Li",6.94,2,1),
				new Element("beryllium","Be",9.0122,2,2)
			
		};
		totalWeight=0.0;
		
		for(Element el: chemicalTest2) {
			totalWeight+=el.getWeight();
		}

		
	}

}
