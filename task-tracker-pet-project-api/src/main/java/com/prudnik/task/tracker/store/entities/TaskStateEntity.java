package com.prudnik.task.tracker.store.entities;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "task_state")
@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskStateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(unique = true)
    private String name;
    private Long ordinal;
    @CreatedDate
    private Instant createdAt = Instant.now();
    @OneToMany
    private List<TaskEntity> tasks;
}
