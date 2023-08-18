package com.plantatree.web.model;

import org.springframework.data.annotation.Id;

public record Item(@Id Integer id, String first_name, String last_name, String email) {
}
