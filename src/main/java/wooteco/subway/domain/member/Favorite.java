package wooteco.subway.domain.member;

import java.util.Objects;

public class Favorite {
    private Long sourceId;
    private Long destinationId;

    private Favorite() {
    }

    public Favorite(Long sourceId, Long destinationId) {
        this.sourceId = sourceId;
        this.destinationId = destinationId;
    }

    public Long getSourceId() {
        return sourceId;
    }

    public Long getDestinationId() {
        return destinationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Favorite favorite = (Favorite) o;
        return Objects.equals(sourceId, favorite.sourceId) &&
                Objects.equals(destinationId, favorite.destinationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceId, destinationId);
    }
}
