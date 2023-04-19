package com.bs.practice.set.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import com.bs.practice.set.compare.SortedLottery;
import com.bs.practice.set.vo.Lottery;

public class LotteryController {
	
	private HashSet lottery=new HashSet();
	private HashSet win=new HashSet();
	
	//셋에 값 저장
	public boolean insertObject(Lottery l) {
		if(l!=null&&!lottery.contains(l)) {
			lottery.add(l); return true;
		}
		return false;
	}
	
	//셋에 있는 값을 삭제
	public boolean deleteObject(Lottery l) {
		if(lottery.contains(l)) {
			lottery.remove(l);
			if(win.contains(l)) {
				win.remove(l);
			}
			return true;
		}
		return false;
	}
	
	//모든 당첨자 출력
	public HashSet winObject() {
		while (true) {
			ArrayList lotteryList = new ArrayList();
			if (lottery.size() >= 4) {
				lotteryList.addAll(lottery);
				while (win.size()<4) {
					win.add(lotteryList.get((int)(Math.random() * lottery.size())));
				}
				break;
			}else {
				System.out.println("추첨 대상자가 4명 미만입니다. 인원을 추가하세요");
				break;
			}
		}
		return win;
	}
	
	//정렬된 당첨자 목록을 출력
	public TreeSet<Lottery> sortedWinObject() {
		TreeSet<Lottery> winTree=new TreeSet(new SortedLottery());
		winTree.addAll(win);
		return winTree;
	}
	
	//특정 당첨자를 검색
	public boolean searchWinner(Lottery l) {
		Iterator it=win.iterator();
		while(it.hasNext()) {
			if(l.equals(it.next())) {
				return true;
			}
		}
		return false;
	}
	
}
