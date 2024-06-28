package com.example.copsboot;

import org.springframework.data.repository.CrudRepository;
import java.util.UUID;

public interface UserRepository extends CrudRepository<User, UUID> {
}
