package ua.rater.api.data;

/**
 * Created by Anastasia on 27.12.2015.
 */
public interface IOption {
        public String getId();

        public void setId(String id);

        public String getLabel();

        public void setLabel(String label);

        public String getDescription();

        public void setDescription(String description);

        public String getUrl();

        public void setUrl(String url);

        public int getPosition();

        public void setPosition(int position);
}
