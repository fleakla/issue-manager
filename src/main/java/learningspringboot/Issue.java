package learningspringboot;


import lombok.Getter;
import org.springframework.social.github.api.GitHubIssue;

/**
 * Created by fleak on 8/19/15.
 * @author Lewis A. Fleak
 */
public class Issue {

    @Getter private String repositoryName;
    @Getter private GitHubIssue gitHubIssue;

    public Issue(String repositoryName, GitHubIssue gitHubIssue) {
        this.repositoryName = repositoryName;
        this.gitHubIssue = gitHubIssue;
    }


}
