package Sustezanie;

public class Пътна_Мрежа {
	public static class Edge{
		int u,v,weight;
		public Edge (int u, int v, int weight) {
			this.u = u;
			this.v = v;
			this.weight = weight;
		}
		public int Compare(Edge other) {
			return Integer.compare(this.weight, other.weight);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
