package chat.entity;

import chat.enumerate.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.jetbrains.annotations.Nullable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Cacheable
@NoArgsConstructor
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "User")
public class User extends AbstractEntity {

    @Nullable
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    Role role;

    @Nullable
    @Column(name = "editChat")
    boolean editChat;
}
