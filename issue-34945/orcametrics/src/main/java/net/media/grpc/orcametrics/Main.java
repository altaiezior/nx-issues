package org.example.orcametrics;

import io.grpc.xds.shaded.com.github.xds.data.orca.v3.OrcaLoadReport;

public class Main {
    public static void main(String[] args) {
        var orcaLoadReport = OrcaLoadReport.newBuilder();
        orcaLoadReport.setCpuUtilization(1.0);
        orcaLoadReport.setRpsFractional(3.0);
        orcaLoadReport.setEps(1.0);
        System.out.println(orcaLoadReport.build());
    }
}
