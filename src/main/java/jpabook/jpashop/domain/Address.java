package jpabook.jpashop.domain;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Embeddable
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class Address {

	private String city;
	private String streat;
	private String zipcode;

}
