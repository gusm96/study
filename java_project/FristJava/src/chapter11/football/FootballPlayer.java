package chapter11.football;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import chapter11.Person;
import chapter11.SimpleNumber;

//1.축구선수 인스턴스를 저장할 수 있는 List<E> 컬렉션 인스턴스를 생성해서 
//  인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.

//2.축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 입력이 되지 않도록 
//  Set<E> 컬렉션을 이용해서 축구선수 인스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.

//3.TreeSet<E>을 이용해서 팀 이름순으로 정렬하고, 같은 팀의 선수들은 이름 순으로 정렬하고, 
//  같은 이름의 선수는 번호 순으로 저장하는 프로그램을 만들어 봅시다.

//4.축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 
//  Map<K,V> 인스턴스를 이용해서 프로그램을 만들어봅시다.

public class FootballPlayer implements Comparable<FootballPlayer> {

	String name;
	int number;
	String team;
	int age;

	public FootballPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	@Override
	public int hashCode() {

		return this.age % 10;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if(obj !=null && obj instanceof FootballPlayer) {
			FootballPlayer fp = (FootballPlayer) obj;
			// 팀, 이름 , 나이가 같은것은 중복 출력 X
			if (this.team.equalsIgnoreCase(fp.team) && this.name.equalsIgnoreCase(fp.name) && this.age == fp.age) {
				result = true;
			}
		}
		return result;
	}

	public int compareTo(FootballPlayer o) {
		// team 이 같은지 체크
		int result = this.team.compareTo(o.team);

		if (result == 0) {
			// name 이 같은지 체크
			result = this.name.compareTo(o.name);
			if (result == 0) {
				if (this.number > o.number) {
					result = 1;
				} else if (this.number < o.number) {
					result = -1;
				} else {
					result = 0;
				}
			}
		}
		return result;
	}

	@Override
	public String toString() {
		return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}

	public static void main(String[] args) {

		// 1. List
		System.out.println("1번 List");
		System.out.println("----------------------------------------------------");
		ArrayList<FootballPlayer> player = new ArrayList<FootballPlayer>();

		player.add(new FootballPlayer("손흥민", 7, "토트넘", 29));
		player.add(new FootballPlayer("메시", 30, "파생", 35));
		player.add(new FootballPlayer("음바페", 7, "파생", 22));
		player.add(new FootballPlayer("호날두", 7, "맨유", 37));

		for (FootballPlayer p : player) {
			System.out.println(p);
		}
		System.out.println("----------------------------------------------------");

		// 2. Set
		System.out.println("2번 HashSet");
		System.out.println("----------------------------------------------------");
		HashSet<FootballPlayer> hPlayer = new HashSet<FootballPlayer>();

		hPlayer.add(new FootballPlayer("손흥민", 7, "토트넘", 29));
		hPlayer.add(new FootballPlayer("음바페", 7, "파생", 22));
		hPlayer.add(new FootballPlayer("호날두", 7, "맨유", 37));
		hPlayer.add(new FootballPlayer("음바페", 7, "파생", 22));
		hPlayer.add(new FootballPlayer("호날두", 7, "맨유", 37));

		Iterator<FootballPlayer> itr = hPlayer.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------------------------------------");

		// 3. TreeSet
		System.out.println("3번 TreeSet");
		System.out.println("----------------------------------------------------");
		TreeSet<FootballPlayer> tPlayer = new TreeSet<FootballPlayer>();

		tPlayer.add(new FootballPlayer("손흥민", 7, "토트넘", 29));
		tPlayer.add(new FootballPlayer("메시", 30, "파생", 35));
		tPlayer.add(new FootballPlayer("음바페", 7, "파생", 22));
		tPlayer.add(new FootballPlayer("호날두", 7, "맨유", 37));
		tPlayer.add(new FootballPlayer("음바페", 10, "파생", 22));
		tPlayer.add(new FootballPlayer("음바페", 9, "파생", 22));

		itr = tPlayer.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("----------------------------------------------------");

		// 4. Map
		System.out.println("4번 Map<>");
		System.out.println("----------------------------------------------------");
		HashMap<Integer, FootballPlayer> map = new HashMap<Integer, FootballPlayer>();
		map.put(2, player.get(1));
		map.put(1, player.get(0));
		map.put(3, player.get(2));

		Iterator<Integer> itr2 = map.keySet().iterator();

		while (itr2.hasNext()) {
			System.out.println(map.get(itr2.next()));
		}

		System.out.println("----------------------------------------------------");

	}
}
