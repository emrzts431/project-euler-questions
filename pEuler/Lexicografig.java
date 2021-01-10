package pEuler;

public class Lexicografig {
	public static void main(String... args) {
		factoriel();
	}
	public static void factoriel() {
		long next = 0;
		for(int i = 0;i<10;i++) {
			for(int j = 0;j<10;j++) {
				if(j == i) continue;
				for(int m = 0;m<10;m++) {
					if(m == j || m == i)continue;
					for(int k = 0;k<10;k++) {
						if(k == i||k==j||k==m)continue;
						for(int l = 0;l<10;l++) {
							if(l==i||l==k||l==m||l==j)continue;
							for(int n=0;n<10;n++) {
								if(n==i||n==j||n==m||n==k||n==l)continue;
								for(int r=0;r<10;r++) {
									if(r==i||r==j||r==m||r==k||r==l||r==n)continue;
									for(int p=0;p<10;p++) {
										if(p==i||p==j||p==m||p==k||p==l||p==n||p==r)continue;
										for(int o=0;o<10;o++) {
											if(o==i||o==j||o==m||o==k||o==l||o==n||o==r||o==p)continue;
											for(int x=0;x<10;x++) {
												if(x==i||x==j||x==m||x==k||x==l||x==n||x==r||x==p||x==o)continue;
												next++;
												if(next==1000000) {
													System.out.println(i+" "+j+" "+m+" "+k+" "+l+" "+n+" "+r+" "+p+" "+o+" "+x);
													break;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
