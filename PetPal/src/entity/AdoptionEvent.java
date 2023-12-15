package entity;

import java.util.ArrayList;
import java.util.List;

import dao.IAdoptable;

class AdoptionEvent {
	private List<IAdoptable> participants;

	public AdoptionEvent() {
		this.participants = new ArrayList<>();
	}

	public void hostEvent() {
		System.out.println("Adoption Event Hosted!");
		for (IAdoptable participant : participants) {
			participant.adopt();
		}
	}

	public void registerParticipant(IAdoptable participant) {
		participants.add(participant);
	}
}
