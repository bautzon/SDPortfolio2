public class Main {
	public static void main(String[] args) {
		/*
		MatrixGraph thisGraph = new MatrixGraph(16);
		thisGraph.addEdge(0, 9, 13);
		thisGraph.addEdge(0, 15, 24);
		thisGraph.addEdge(9, 7, 26);
		thisGraph.addEdge(7, 8, 27);
		thisGraph.addEdge(15, 10, 28);
		thisGraph.addEdge(10, 1, 25);
		thisGraph.addEdge(1, 11, 19);
		thisGraph.addEdge(11, 14, 15);
		thisGraph.addEdge(14, 13, 14);
		thisGraph.addEdge(13, 5, 20);
		thisGraph.addEdge(1, 6, 24);
		thisGraph.addEdge(6, 12, 25);
		thisGraph.addEdge(12, 3, 33);
		thisGraph.addEdge(13, 4, 39);
		thisGraph.addEdge(12, 2, 32);
		thisGraph.printGraph();
		thisGraph.MSTPrims();
		*/


  AdjacencyGraph MyGraph=new AdjacencyGraph();
    Vertex a = new Vertex("Eskildstrup");
    Vertex b = new Vertex("Haslev");
    Vertex c = new Vertex( "Holbæk");
    Vertex d = new Vertex("Jægerspris");
    Vertex e = new Vertex("Kalundborg");
    Vertex f = new Vertex( "Korsør");
    Vertex g = new Vertex("Køge");
		Vertex h = new Vertex("Maribo");
		Vertex i = new Vertex("Nakskov");
		Vertex j = new Vertex("Nykøbing F");
		Vertex k = new Vertex("Næstved");
		Vertex l = new Vertex("Ringsted");
		Vertex m = new Vertex("Roskilde");
		Vertex n = new Vertex("Slagelse");
		Vertex o = new Vertex("Sorø");
		Vertex p = new Vertex("Vordingborg");
	
    MyGraph.addVertex(a);
    MyGraph.addVertex(b);
    MyGraph.addVertex(c);
    MyGraph.addVertex(d);
    MyGraph.addVertex(e);
    MyGraph.addVertex(f);
    MyGraph.addVertex(g);
    MyGraph.addVertex(h);
    MyGraph.addVertex(i);
    MyGraph.addVertex(j);
    MyGraph.addVertex(k);
    MyGraph.addVertex(l);
    MyGraph.addVertex(m);
    MyGraph.addVertex(n);
    MyGraph.addVertex(o);
    MyGraph.addVertex(p);
		//AdjacencyGraph.newEdge;

    MyGraph.addEdge(a,h,28);
    MyGraph.addEdge(a,j, 13);
    MyGraph.addEdge(a,p,24);

    MyGraph.addEdge(b,f,60);
  	MyGraph.addEdge(b,g,24);
  	MyGraph.addEdge(b,k,25);
  	MyGraph.addEdge(b,l,19);
  	MyGraph.addEdge(b,m, 47);
  	MyGraph.addEdge(b,n,48);
  	MyGraph.addEdge(b,o, 34);
  	MyGraph.addEdge(b,p, 40);

  	MyGraph.addEdge(c, d, 34);
		MyGraph.addEdge(c,e, 44);
		MyGraph.addEdge(c,f, 66);
		MyGraph.addEdge(c,l, 36);
		MyGraph.addEdge(c,m, 32);
		MyGraph.addEdge(c,n, 46);
		MyGraph.addEdge(c,o, 34);

		MyGraph.addEdge(d,f, 95);
		MyGraph.addEdge(d,g, 58);
		MyGraph.addEdge(d,l, 56);
		MyGraph.addEdge(d,m, 33);
		MyGraph.addEdge(d,n, 74);
		MyGraph.addEdge(d,o, 63);

		MyGraph.addEdge(e,l, 62);
		MyGraph.addEdge(e,m, 70);
		MyGraph.addEdge(e,n, 39);
		MyGraph.addEdge(e,o, 51);

		MyGraph.addEdge(f,k, 45);
		MyGraph.addEdge(f,n, 20);

		MyGraph.addEdge(g,k, 45);
		MyGraph.addEdge(g,l, 28);
		MyGraph.addEdge(g,n, 25);
		MyGraph.addEdge(g,p, 60);

		MyGraph.addEdge(h,i, 27);
		MyGraph.addEdge(h,j, 26);

		MyGraph.addEdge(k,m, 57);
		MyGraph.addEdge(k,l, 26);
		MyGraph.addEdge(k,n, 37);
		MyGraph.addEdge(k,o, 32);
		MyGraph.addEdge(k,p, 28);

		MyGraph.addEdge(l,m, 31);
		MyGraph.addEdge(l,o, 15);
		MyGraph.addEdge(l,p, 58);
    
		MyGraph.addEdge(n,o, 14);
  	MyGraph.PrintGraph();
		
  MatrixGraph thisGraph = new MatrixGraph(16);

    thisGraph.addEdge(0,7,28);
    thisGraph.addEdge(0,9, 13);
    thisGraph.addEdge(0,15,24);

    thisGraph.addEdge(1,5,60);
  	thisGraph.addEdge(1,6,24);
  	thisGraph.addEdge(1,10,25);
  	thisGraph.addEdge(1,11,19);
  	thisGraph.addEdge(1,12, 47);
  	thisGraph.addEdge(1,13,48);
  	thisGraph.addEdge(1,14, 34);
  	thisGraph.addEdge(1,15, 40);

  	thisGraph.addEdge(2, 3, 34);
	  thisGraph.addEdge(2,4, 44);
	  thisGraph.addEdge(2,5, 66);
	  thisGraph.addEdge(2,11, 36);
	  thisGraph.addEdge(2,12, 32);
	  thisGraph.addEdge(2,13, 46);
	  thisGraph.addEdge(2,14, 34);

	  thisGraph.addEdge(3,5, 95);
	  thisGraph.addEdge(3,6, 58);
	  thisGraph.addEdge(3,11, 56);
	  thisGraph.addEdge(3,12, 33);
	  thisGraph.addEdge(3,13, 74);
	  thisGraph.addEdge(3,14, 63);

	  thisGraph.addEdge(4,11, 62);
	  thisGraph.addEdge(4,12, 70);
	  thisGraph.addEdge(4,13, 39);
	  thisGraph.addEdge(4,14, 51);

	  thisGraph.addEdge(5,10, 45);
	  thisGraph.addEdge(5,13, 20);

	  thisGraph.addEdge(6,10, 45);
	  thisGraph.addEdge(6,11, 28);
	  thisGraph.addEdge(6,13, 25);
	  thisGraph.addEdge(6,15, 60);

	  thisGraph.addEdge(7,8, 27);
	  thisGraph.addEdge(7,9, 26);

	  thisGraph.addEdge(10,12, 57);
	  thisGraph.addEdge(10,11, 26);
	  thisGraph.addEdge(10,13, 37);
	  thisGraph.addEdge(10,14, 32);
	  thisGraph.addEdge(10,15, 28);

	  thisGraph.addEdge(11,12, 31);
	  thisGraph.addEdge(11,14, 15);
	  thisGraph.addEdge(11,15, 58);
		thisGraph.addEdge(13,15, 14);

		thisGraph.printGraph();
		thisGraph.MSTPrims();

	}

}