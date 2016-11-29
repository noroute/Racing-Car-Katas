package tddmicroexercises.leaderboard;

public class SelfDrivingCar extends Driver {

    private String algorithmVersion;

    @Override
    public boolean equals(final Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }

        final SelfDrivingCar that = (SelfDrivingCar) o;

        return algorithmVersion.equals(that.algorithmVersion);
    }

    @Override
    public int hashCode() {

        int result = super.hashCode();
        result = 31 * result + algorithmVersion.hashCode();
        return result;
    }

    public SelfDrivingCar(String algorithmVersion, String company) {
        super(algorithmVersion, company);
        this.algorithmVersion = algorithmVersion;
    }

    public String getAlgorithmVersion() {
        return algorithmVersion;
    }

    public void setAlgorithmVersion(String algorithmVersion) {
        this.algorithmVersion = algorithmVersion;
    }

    @Override
    public String getDisplayName() {
        return "Self Driving Car - " + getCountry() + " (" + algorithmVersion + ")";
    }

}
