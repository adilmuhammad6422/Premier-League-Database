package com.example.Premier_League_Database.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {
    void deleteByPlayerName(String playerName);  // CamelCase to match the entity field
    Optional<Player> findByPlayerName(String playerName);  // CamelCase to match the entity field
}
