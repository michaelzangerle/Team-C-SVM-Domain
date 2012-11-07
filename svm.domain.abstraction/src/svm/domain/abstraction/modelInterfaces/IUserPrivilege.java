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
        MATCH_MANAGER(4),
        VIEW_ONLY(5);
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
                    return MATCH_MANAGER;
                case 5:
                    return VIEW_ONLY;
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
