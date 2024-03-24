package test;

public class Liste {
	Yapı head = null;
	Yapı tail = null;
	void ekle (int x) {
		Yapı eleman = new Yapı();
		eleman.data = x;
		eleman.next = null;
		if (head==null) {
			System.out.println("Liste Boş Olduğğundan İlk Elemana Ekledim");
			head = eleman;
			tail = eleman;
		}
		else {
			tail.next = eleman;
			System.out.println("Sona eklendi eleman Kanki");
			tail = eleman;
		}
	}
	void yazdir() {
		if(head == null) {
			System.out.println("Boş Listeyi Yazdıramazsın Kanka");
		}
		else {
			Yapı ref = head;
			while (ref != null) {
				System.out.println("->" + ref.data);
				ref = ref.next;
			}
		}
	}
}
