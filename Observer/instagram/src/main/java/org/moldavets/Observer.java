package org.moldavets;

import org.moldavets.model.Post;

import java.util.List;

public interface Observer {
    void accept(List<Post> posts);
}
