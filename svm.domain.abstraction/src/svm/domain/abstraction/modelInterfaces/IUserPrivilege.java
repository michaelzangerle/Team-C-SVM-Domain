package svm.domain.abstraction.modelInterfaces;

/**
 * Projectteam: Team C
 * Date: 24.10.12
 */
public interface IUserPrivilege extends IModel {
    public enum Privileges {
        ADMIN(1),
        MANAGER(2),
        MEMBER_MANAGER(3),
        CONTEST_MANAGER(4),
        VIEW_ONLY(8),
        CONTEST_TEAM_MANAGER(6),
        CONTEST_MATCH_MANAGER(5),
        CONTEST_SUBTEAM_MANAGER(7);

        private int alias;

        private Privileges(int alias) {
            this.alias = alias;
        }

        public int getAlias() {
            return alias;
        }

        public static Privileges get(int alias) {
            switch (alias) {
                case 1:
                    return ADMIN;
                case 2:
                    return MANAGER;
                case 3:
                    return MEMBER_MANAGER;
                case 4:
                    return CONTEST_MANAGER;
                case 8:
                    return VIEW_ONLY;
                case 6:
                    return CONTEST_TEAM_MANAGER;
                case 5:
                    return CONTEST_MATCH_MANAGER;
                case 7:
                    return CONTEST_SUBTEAM_MANAGER;
            }
            return null;
        }
    }

    String getName();

    void setName(String name);

    String getDescription();

    void setDescription(String description);

    Privileges getAlias();
}
