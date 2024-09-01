package com.example.bti;

import java.sql.*;

public class DatabaseHandler extends Configs {
    Connection dbConnection;

    public Connection getDbConnection() throws ClassNotFoundException, SQLException{
        String connectionString = "jdbc:mysql://" + dbHost + ":" + dbPort + "/" + dbName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        Class.forName("com.mysql.cj.jdbc.Driver");

        dbConnection = DriverManager.getConnection(connectionString, dbUser, dbPass);

        return dbConnection;
    }

    void addRequest(String numReq, String fiOzakText, String phoneText,
                    String fizUrText, String bankText, String numBankText,
                    String adressText, String districtText, String dateRequestText,
                    String docNameText, String srochnoeText, String dateVidachiText,
                    String priceDocText, String dateTechText, String timeTechText,
                    String fiOnachText, String fiOispText, String datePeredachiText,
                    String fioTechText, String payText, String datePayText,
                    String paySumText, String docIssuedText, String primechanieText)
    {
        String insert = "INSERT INTO " + requests_const.REQUESTS_TABLE + "(`" + requests_const.NUM_REQ + "`,`" + requests_const.FIO_ZAK +
                "`,`" + requests_const.PHONE + "`,`" + requests_const.FIZ_UR + "`,`" + requests_const.BANK + "`,`" +
                requests_const.NUM_BANK + "`,`" + requests_const.ADDRESS + "`,`" + requests_const.DISTRICT + "`,`" +
                requests_const.DATE_REQUEST + "`,`" + requests_const.DOC_NAME + "`,`" + requests_const.SROCHNOE + "`,`" +
                requests_const.DATE_VIDACHI + "`,`" + requests_const.PRICE_DOC + "`,`" + requests_const.DATE_TECH + "`,`" +
                requests_const.TIME_TECH + "`,`" + requests_const.FIO_NACH + "`,`" + requests_const.FIO_ISP + "`,`" +
                requests_const.DATE_PEREDACHI + "`,`" + requests_const.FIO_TECH + "`,`" + requests_const.PAY + "`,`" +
                requests_const.DATE_PAY + "`,`" + requests_const.PAY_SUM + "`,`" + requests_const.DOC_ISSUED + "`,`" +
                requests_const.PRIMECHANIE + "`)" + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1, numReq);
            prst.setString(2, fiOzakText);
            prst.setString(3, phoneText);
            prst.setString(4, fizUrText);
            prst.setString(5, bankText);
            prst.setString(6, numBankText);
            prst.setString(7, adressText);
            prst.setString(8, districtText);
            prst.setString(9, dateRequestText);
            prst.setString(10, docNameText);
            prst.setString(11, srochnoeText);
            prst.setString(12, dateVidachiText);
            prst.setString(13, priceDocText);
            prst.setString(14, dateTechText);
            prst.setString(15, timeTechText);
            prst.setString(16, fiOnachText);
            prst.setString(17, fiOispText);
            prst.setString(18, datePeredachiText);
            prst.setString(19, fioTechText);
            prst.setString(20, payText);
            prst.setString(21, datePayText);
            prst.setString(22, paySumText);
            prst.setString(23, docIssuedText);
            prst.setString(24, primechanieText);

            prst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    void addCentralniy(String numReq, String fiOzakText, String phoneText,
                       String fizUrText, String bankText, String numBankText,
                       String adressText, String districtText, String dateRequestText,
                       String docNameText, String srochnoeText, String dateVidachiText,
                       String priceDocText, String dateTechText, String timeTechText,
                       String fiOnachText, String fiOispText, String datePeredachiText,
                       String fioTechText, String payText, String datePayText,
                       String paySumText, String docIssuedText, String primechanieText)
    {
        String insert = "INSERT INTO " + centralniy_const.REQUESTS_TABLE + "(`" + centralniy_const.NUM_REQ + "`,`" + centralniy_const.FIO_ZAK +
                "`,`" + centralniy_const.PHONE + "`,`" + centralniy_const.FIZ_UR + "`,`" + centralniy_const.BANK + "`,`" +
                centralniy_const.NUM_BANK + "`,`" + centralniy_const.ADDRESS + "`,`" + centralniy_const.DISTRICT + "`,`" +
                centralniy_const.DATE_REQUEST + "`,`" + centralniy_const.DOC_NAME + "`,`" + centralniy_const.SROCHNOE + "`,`" +
                centralniy_const.DATE_VIDACHI + "`,`" + centralniy_const.PRICE_DOC + "`,`" + centralniy_const.DATE_TECH + "`,`" +
                centralniy_const.TIME_TECH + "`,`" + centralniy_const.FIO_NACH + "`,`" + centralniy_const.FIO_ISP + "`,`" +
                centralniy_const.DATE_PEREDACHI + "`,`" + centralniy_const.FIO_TECH + "`,`" + centralniy_const.PAY + "`,`" +
                centralniy_const.DATE_PAY + "`,`" + centralniy_const.PAY_SUM + "`,`" + centralniy_const.DOC_ISSUED + "`,`" +
                centralniy_const.PRIMECHANIE + "`)" + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1, numReq);
            prst.setString(2, fiOzakText);
            prst.setString(3, phoneText);
            prst.setString(4, fizUrText);
            prst.setString(5, bankText);
            prst.setString(6, numBankText);
            prst.setString(7, adressText);
            prst.setString(8, districtText);
            prst.setString(9, dateRequestText);
            prst.setString(10, docNameText);
            prst.setString(11, srochnoeText);
            prst.setString(12, dateVidachiText);
            prst.setString(13, priceDocText);
            prst.setString(14, dateTechText);
            prst.setString(15, timeTechText);
            prst.setString(16, fiOnachText);
            prst.setString(17, fiOispText);
            prst.setString(18, datePeredachiText);
            prst.setString(19, fioTechText);
            prst.setString(20, payText);
            prst.setString(21, datePayText);
            prst.setString(22, paySumText);
            prst.setString(23, docIssuedText);
            prst.setString(24, primechanieText);

            prst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    void addZarechenskiy (String numReq, String fiOzakText, String phoneText,
                       String fizUrText, String bankText, String numBankText,
                       String adressText, String districtText, String dateRequestText,
                       String docNameText, String srochnoeText, String dateVidachiText,
                       String priceDocText, String dateTechText, String timeTechText,
                       String fiOnachText, String fiOispText, String datePeredachiText,
                       String fioTechText, String payText, String datePayText,
                       String paySumText, String docIssuedText, String primechanieText)
    {

        String insert = "INSERT INTO " + zarechenskiy_const.REQUESTS_TABLE + "(`" + zarechenskiy_const.NUM_REQ + "`,`" + zarechenskiy_const.FIO_ZAK +
                "`,`" + zarechenskiy_const.PHONE + "`,`" + zarechenskiy_const.FIZ_UR + "`,`" + zarechenskiy_const.BANK + "`,`" +
                zarechenskiy_const.NUM_BANK + "`,`" + zarechenskiy_const.ADDRESS + "`,`" + zarechenskiy_const.DISTRICT + "`,`" +
                zarechenskiy_const.DATE_REQUEST + "`,`" + zarechenskiy_const.DOC_NAME + "`,`" + zarechenskiy_const.SROCHNOE + "`,`" +
                zarechenskiy_const.DATE_VIDACHI + "`,`" + zarechenskiy_const.PRICE_DOC + "`,`" + zarechenskiy_const.DATE_TECH + "`,`" +
                zarechenskiy_const.TIME_TECH + "`,`" + zarechenskiy_const.FIO_NACH + "`,`" + zarechenskiy_const.FIO_ISP + "`,`" +
                zarechenskiy_const.DATE_PEREDACHI + "`,`" + zarechenskiy_const.FIO_TECH + "`,`" + zarechenskiy_const.PAY + "`,`" +
                zarechenskiy_const.DATE_PAY + "`,`" + zarechenskiy_const.PAY_SUM + "`,`" + zarechenskiy_const.DOC_ISSUED + "`,`" +
                zarechenskiy_const.PRIMECHANIE + "`)" + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1, numReq);
            prst.setString(2, fiOzakText);
            prst.setString(3, phoneText);
            prst.setString(4, fizUrText);
            prst.setString(5, bankText);
            prst.setString(6, numBankText);
            prst.setString(7, adressText);
            prst.setString(8, districtText);
            prst.setString(9, dateRequestText);
            prst.setString(10, docNameText);
            prst.setString(11, srochnoeText);
            prst.setString(12, dateVidachiText);
            prst.setString(13, priceDocText);
            prst.setString(14, dateTechText);
            prst.setString(15, timeTechText);
            prst.setString(16, fiOnachText);
            prst.setString(17, fiOispText);
            prst.setString(18, datePeredachiText);
            prst.setString(19, fioTechText);
            prst.setString(20, payText);
            prst.setString(21, datePayText);
            prst.setString(22, paySumText);
            prst.setString(23, docIssuedText);
            prst.setString(24, primechanieText);

            prst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    void addProletarskiy (String numReq, String fiOzakText, String phoneText,
                       String fizUrText, String bankText, String numBankText,
                       String adressText, String districtText, String dateRequestText,
                       String docNameText, String srochnoeText, String dateVidachiText,
                       String priceDocText, String dateTechText, String timeTechText,
                       String fiOnachText, String fiOispText, String datePeredachiText,
                       String fioTechText, String payText, String datePayText,
                       String paySumText, String docIssuedText, String primechanieText)
    {
        String insert = "INSERT INTO " + proletarskiy_const.REQUESTS_TABLE + "(`" + proletarskiy_const.NUM_REQ + "`,`" + proletarskiy_const.FIO_ZAK +
                "`,`" + proletarskiy_const.PHONE + "`,`" + proletarskiy_const.FIZ_UR + "`,`" + proletarskiy_const.BANK + "`,`" +
                proletarskiy_const.NUM_BANK + "`,`" + proletarskiy_const.ADDRESS + "`,`" + proletarskiy_const.DISTRICT + "`,`" +
                proletarskiy_const.DATE_REQUEST + "`,`" + proletarskiy_const.DOC_NAME + "`,`" + proletarskiy_const.SROCHNOE + "`,`" +
                proletarskiy_const.DATE_VIDACHI + "`,`" + proletarskiy_const.PRICE_DOC + "`,`" + proletarskiy_const.DATE_TECH + "`,`" +
                proletarskiy_const.TIME_TECH + "`,`" + proletarskiy_const.FIO_NACH + "`,`" + proletarskiy_const.FIO_ISP + "`,`" +
                proletarskiy_const.DATE_PEREDACHI + "`,`" + proletarskiy_const.FIO_TECH + "`,`" + proletarskiy_const.PAY + "`,`" +
                proletarskiy_const.DATE_PAY + "`,`" + proletarskiy_const.PAY_SUM + "`,`" + proletarskiy_const.DOC_ISSUED + "`,`" +
                proletarskiy_const.PRIMECHANIE + "`)" + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1, numReq);
            prst.setString(2, fiOzakText);
            prst.setString(3, phoneText);
            prst.setString(4, fizUrText);
            prst.setString(5, bankText);
            prst.setString(6, numBankText);
            prst.setString(7, adressText);
            prst.setString(8, districtText);
            prst.setString(9, dateRequestText);
            prst.setString(10, docNameText);
            prst.setString(11, srochnoeText);
            prst.setString(12, dateVidachiText);
            prst.setString(13, priceDocText);
            prst.setString(14, dateTechText);
            prst.setString(15, timeTechText);
            prst.setString(16, fiOnachText);
            prst.setString(17, fiOispText);
            prst.setString(18, datePeredachiText);
            prst.setString(19, fioTechText);
            prst.setString(20, payText);
            prst.setString(21, datePayText);
            prst.setString(22, paySumText);
            prst.setString(23, docIssuedText);
            prst.setString(24, primechanieText);

            prst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    void addSovetskiy (String numReq, String fiOzakText, String phoneText,
                       String fizUrText, String bankText, String numBankText,
                       String adressText, String districtText, String dateRequestText,
                       String docNameText, String srochnoeText, String dateVidachiText,
                       String priceDocText, String dateTechText, String timeTechText,
                       String fiOnachText, String fiOispText, String datePeredachiText,
                       String fioTechText, String payText, String datePayText,
                       String paySumText, String docIssuedText, String primechanieText)
    {
        String insert = "INSERT INTO " + sovetskiy_const.REQUESTS_TABLE + "(`" + sovetskiy_const.NUM_REQ + "`,`" + sovetskiy_const.FIO_ZAK +
                "`,`" + sovetskiy_const.PHONE + "`,`" + sovetskiy_const.FIZ_UR + "`,`" + sovetskiy_const.BANK + "`,`" +
                sovetskiy_const.NUM_BANK + "`,`" + sovetskiy_const.ADDRESS + "`,`" + sovetskiy_const.DISTRICT + "`,`" +
                sovetskiy_const.DATE_REQUEST + "`,`" + sovetskiy_const.DOC_NAME + "`,`" + sovetskiy_const.SROCHNOE + "`,`" +
                sovetskiy_const.DATE_VIDACHI + "`,`" + sovetskiy_const.PRICE_DOC + "`,`" + sovetskiy_const.DATE_TECH + "`,`" +
                sovetskiy_const.TIME_TECH + "`,`" + sovetskiy_const.FIO_NACH + "`,`" + sovetskiy_const.FIO_ISP + "`,`" +
                sovetskiy_const.DATE_PEREDACHI + "`,`" + sovetskiy_const.FIO_TECH + "`,`" + sovetskiy_const.PAY + "`,`" +
                sovetskiy_const.DATE_PAY + "`,`" + sovetskiy_const.PAY_SUM + "`,`" + sovetskiy_const.DOC_ISSUED + "`,`" +
                sovetskiy_const.PRIMECHANIE + "`)" + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1, numReq);
            prst.setString(2, fiOzakText);
            prst.setString(3, phoneText);
            prst.setString(4, fizUrText);
            prst.setString(5, bankText);
            prst.setString(6, numBankText);
            prst.setString(7, adressText);
            prst.setString(8, districtText);
            prst.setString(9, dateRequestText);
            prst.setString(10, docNameText);
            prst.setString(11, srochnoeText);
            prst.setString(12, dateVidachiText);
            prst.setString(13, priceDocText);
            prst.setString(14, dateTechText);
            prst.setString(15, timeTechText);
            prst.setString(16, fiOnachText);
            prst.setString(17, fiOispText);
            prst.setString(18, datePeredachiText);
            prst.setString(19, fioTechText);
            prst.setString(20, payText);
            prst.setString(21, datePayText);
            prst.setString(22, paySumText);
            prst.setString(23, docIssuedText);
            prst.setString(24, primechanieText);

            prst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    void addPrivokzalniy (String numReq, String fiOzakText, String phoneText,
                       String fizUrText, String bankText, String numBankText,
                       String adressText, String districtText, String dateRequestText,
                       String docNameText, String srochnoeText, String dateVidachiText,
                       String priceDocText, String dateTechText, String timeTechText,
                       String fiOnachText, String fiOispText, String datePeredachiText,
                       String fioTechText, String payText, String datePayText,
                       String paySumText, String docIssuedText, String primechanieText)
    {
        String insert = "INSERT INTO " + privokzalniy_const.REQUESTS_TABLE + "(`" + privokzalniy_const.NUM_REQ + "`,`" + privokzalniy_const.FIO_ZAK +
                "`,`" + privokzalniy_const.PHONE + "`,`" + privokzalniy_const.FIZ_UR + "`,`" + privokzalniy_const.BANK + "`,`" +
                privokzalniy_const.NUM_BANK + "`,`" + privokzalniy_const.ADDRESS + "`,`" + privokzalniy_const.DISTRICT + "`,`" +
                privokzalniy_const.DATE_REQUEST + "`,`" + privokzalniy_const.DOC_NAME + "`,`" + privokzalniy_const.SROCHNOE + "`,`" +
                privokzalniy_const.DATE_VIDACHI + "`,`" + privokzalniy_const.PRICE_DOC + "`,`" + privokzalniy_const.DATE_TECH + "`,`" +
                privokzalniy_const.TIME_TECH + "`,`" + privokzalniy_const.FIO_NACH + "`,`" + privokzalniy_const.FIO_ISP + "`,`" +
                privokzalniy_const.DATE_PEREDACHI + "`,`" + privokzalniy_const.FIO_TECH + "`,`" + privokzalniy_const.PAY + "`,`" +
                privokzalniy_const.DATE_PAY + "`,`" + privokzalniy_const.PAY_SUM + "`,`" + privokzalniy_const.DOC_ISSUED + "`,`" +
                privokzalniy_const.PRIMECHANIE + "`)" + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1, numReq);
            prst.setString(2, fiOzakText);
            prst.setString(3, phoneText);
            prst.setString(4, fizUrText);
            prst.setString(5, bankText);
            prst.setString(6, numBankText);
            prst.setString(7, adressText);
            prst.setString(8, districtText);
            prst.setString(9, dateRequestText);
            prst.setString(10, docNameText);
            prst.setString(11, srochnoeText);
            prst.setString(12, dateVidachiText);
            prst.setString(13, priceDocText);
            prst.setString(14, dateTechText);
            prst.setString(15, timeTechText);
            prst.setString(16, fiOnachText);
            prst.setString(17, fiOispText);
            prst.setString(18, datePeredachiText);
            prst.setString(19, fioTechText);
            prst.setString(20, payText);
            prst.setString(21, datePayText);
            prst.setString(22, paySumText);
            prst.setString(23, docIssuedText);
            prst.setString(24, primechanieText);

            prst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    void addIspKorotkov(String numReq, String fiOzakText, String phoneText,
                       String fizUrText, String bankText, String numBankText,
                       String adressText, String districtText, String dateRequestText,
                       String docNameText, String srochnoeText, String dateVidachiText,
                       String priceDocText, String dateTechText, String timeTechText,
                       String fiOnachText, String fiOispText, String datePeredachiText,
                       String fioTechText, String payText, String datePayText,
                       String paySumText, String docIssuedText, String primechanieText)
    {
        String insert = "INSERT INTO " + isp_korotkov_const.REQUESTS_TABLE + "(`" + isp_korotkov_const.NUM_REQ + "`,`" + isp_korotkov_const.FIO_ZAK +
                "`,`" + isp_korotkov_const.PHONE + "`,`" + isp_korotkov_const.FIZ_UR + "`,`" + isp_korotkov_const.BANK + "`,`" +
                isp_korotkov_const.NUM_BANK + "`,`" + isp_korotkov_const.ADDRESS + "`,`" + isp_korotkov_const.DISTRICT + "`,`" +
                isp_korotkov_const.DATE_REQUEST + "`,`" + isp_korotkov_const.DOC_NAME + "`,`" + isp_korotkov_const.SROCHNOE + "`,`" +
                isp_korotkov_const.DATE_VIDACHI + "`,`" + isp_korotkov_const.PRICE_DOC + "`,`" + isp_korotkov_const.DATE_TECH + "`,`" +
                isp_korotkov_const.TIME_TECH + "`,`" + isp_korotkov_const.FIO_NACH + "`,`" + isp_korotkov_const.FIO_ISP + "`,`" +
                isp_korotkov_const.DATE_PEREDACHI + "`,`" + isp_korotkov_const.FIO_TECH + "`,`" + isp_korotkov_const.PAY + "`,`" +
                isp_korotkov_const.DATE_PAY + "`,`" + isp_korotkov_const.PAY_SUM + "`,`" + isp_korotkov_const.DOC_ISSUED + "`,`" +
                isp_korotkov_const.PRIMECHANIE + "`)" + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1, numReq);
            prst.setString(2, fiOzakText);
            prst.setString(3, phoneText);
            prst.setString(4, fizUrText);
            prst.setString(5, bankText);
            prst.setString(6, numBankText);
            prst.setString(7, adressText);
            prst.setString(8, districtText);
            prst.setString(9, dateRequestText);
            prst.setString(10, docNameText);
            prst.setString(11, srochnoeText);
            prst.setString(12, dateVidachiText);
            prst.setString(13, priceDocText);
            prst.setString(14, dateTechText);
            prst.setString(15, timeTechText);
            prst.setString(16, fiOnachText);
            prst.setString(17, fiOispText);
            prst.setString(18, datePeredachiText);
            prst.setString(19, fioTechText);
            prst.setString(20, payText);
            prst.setString(21, datePayText);
            prst.setString(22, paySumText);
            prst.setString(23, docIssuedText);
            prst.setString(24, primechanieText);

            prst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    void addIspSoshkina(String numReq, String fiOzakText, String phoneText,
                        String fizUrText, String bankText, String numBankText,
                        String adressText, String districtText, String dateRequestText,
                        String docNameText, String srochnoeText, String dateVidachiText,
                        String priceDocText, String dateTechText, String timeTechText,
                        String fiOnachText, String fiOispText, String datePeredachiText,
                        String fioTechText, String payText, String datePayText,
                        String paySumText, String docIssuedText, String primechanieText)
    {
        String insert = "INSERT INTO " + isp_soshkina_const.REQUESTS_TABLE + "(`" + isp_soshkina_const.NUM_REQ + "`,`" + isp_soshkina_const.FIO_ZAK +
                "`,`" + isp_soshkina_const.PHONE + "`,`" + isp_soshkina_const.FIZ_UR + "`,`" + isp_soshkina_const.BANK + "`,`" +
                isp_soshkina_const.NUM_BANK + "`,`" + isp_soshkina_const.ADDRESS + "`,`" + isp_soshkina_const.DISTRICT + "`,`" +
                isp_soshkina_const.DATE_REQUEST + "`,`" + isp_soshkina_const.DOC_NAME + "`,`" + isp_soshkina_const.SROCHNOE + "`,`" +
                isp_soshkina_const.DATE_VIDACHI + "`,`" + isp_soshkina_const.PRICE_DOC + "`,`" + isp_soshkina_const.DATE_TECH + "`,`" +
                isp_soshkina_const.TIME_TECH + "`,`" + isp_soshkina_const.FIO_NACH + "`,`" + isp_soshkina_const.FIO_ISP + "`,`" +
                isp_soshkina_const.DATE_PEREDACHI + "`,`" + isp_soshkina_const.FIO_TECH + "`,`" + isp_soshkina_const.PAY + "`,`" +
                isp_soshkina_const.DATE_PAY + "`,`" + isp_soshkina_const.PAY_SUM + "`,`" + isp_soshkina_const.DOC_ISSUED + "`,`" +
                isp_soshkina_const.PRIMECHANIE + "`)" + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1, numReq);
            prst.setString(2, fiOzakText);
            prst.setString(3, phoneText);
            prst.setString(4, fizUrText);
            prst.setString(5, bankText);
            prst.setString(6, numBankText);
            prst.setString(7, adressText);
            prst.setString(8, districtText);
            prst.setString(9, dateRequestText);
            prst.setString(10, docNameText);
            prst.setString(11, srochnoeText);
            prst.setString(12, dateVidachiText);
            prst.setString(13, priceDocText);
            prst.setString(14, dateTechText);
            prst.setString(15, timeTechText);
            prst.setString(16, fiOnachText);
            prst.setString(17, fiOispText);
            prst.setString(18, datePeredachiText);
            prst.setString(19, fioTechText);
            prst.setString(20, payText);
            prst.setString(21, datePayText);
            prst.setString(22, paySumText);
            prst.setString(23, docIssuedText);
            prst.setString(24, primechanieText);

            prst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    void addIspNovikov(String numReq, String fiOzakText, String phoneText,
                        String fizUrText, String bankText, String numBankText,
                        String adressText, String districtText, String dateRequestText,
                        String docNameText, String srochnoeText, String dateVidachiText,
                        String priceDocText, String dateTechText, String timeTechText,
                        String fiOnachText, String fiOispText, String datePeredachiText,
                        String fioTechText, String payText, String datePayText,
                        String paySumText, String docIssuedText, String primechanieText)
    {
        String insert = "INSERT INTO " + isp_novikov_const.REQUESTS_TABLE + "(`" + isp_novikov_const.NUM_REQ + "`,`" + isp_novikov_const.FIO_ZAK +
                "`,`" + isp_novikov_const.PHONE + "`,`" + isp_novikov_const.FIZ_UR + "`,`" + isp_novikov_const.BANK + "`,`" +
                isp_novikov_const.NUM_BANK + "`,`" + isp_novikov_const.ADDRESS + "`,`" + isp_novikov_const.DISTRICT + "`,`" +
                isp_novikov_const.DATE_REQUEST + "`,`" + isp_novikov_const.DOC_NAME + "`,`" + isp_novikov_const.SROCHNOE + "`,`" +
                isp_novikov_const.DATE_VIDACHI + "`,`" + isp_novikov_const.PRICE_DOC + "`,`" + isp_novikov_const.DATE_TECH + "`,`" +
                isp_novikov_const.TIME_TECH + "`,`" + isp_novikov_const.FIO_NACH + "`,`" + isp_novikov_const.FIO_ISP + "`,`" +
                isp_novikov_const.DATE_PEREDACHI + "`,`" + isp_novikov_const.FIO_TECH + "`,`" + isp_novikov_const.PAY + "`,`" +
                isp_novikov_const.DATE_PAY + "`,`" + isp_novikov_const.PAY_SUM + "`,`" + isp_novikov_const.DOC_ISSUED + "`,`" +
                isp_novikov_const.PRIMECHANIE + "`)" + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1, numReq);
            prst.setString(2, fiOzakText);
            prst.setString(3, phoneText);
            prst.setString(4, fizUrText);
            prst.setString(5, bankText);
            prst.setString(6, numBankText);
            prst.setString(7, adressText);
            prst.setString(8, districtText);
            prst.setString(9, dateRequestText);
            prst.setString(10, docNameText);
            prst.setString(11, srochnoeText);
            prst.setString(12, dateVidachiText);
            prst.setString(13, priceDocText);
            prst.setString(14, dateTechText);
            prst.setString(15, timeTechText);
            prst.setString(16, fiOnachText);
            prst.setString(17, fiOispText);
            prst.setString(18, datePeredachiText);
            prst.setString(19, fioTechText);
            prst.setString(20, payText);
            prst.setString(21, datePayText);
            prst.setString(22, paySumText);
            prst.setString(23, docIssuedText);
            prst.setString(24, primechanieText);

            prst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    void addTechPopov(String numReq, String fiOzakText, String phoneText,
                       String fizUrText, String bankText, String numBankText,
                       String adressText, String districtText, String dateRequestText,
                       String docNameText, String srochnoeText, String dateVidachiText,
                       String priceDocText, String dateTechText, String timeTechText,
                       String fiOnachText, String fiOispText, String datePeredachiText,
                       String fioTechText, String payText, String datePayText,
                       String paySumText, String docIssuedText, String primechanieText)
    {
        String insert = "INSERT INTO " + tech_popov_const.REQUESTS_TABLE + "(`" + tech_popov_const.NUM_REQ + "`,`" + tech_popov_const.FIO_ZAK +
                "`,`" + tech_popov_const.PHONE + "`,`" + tech_popov_const.FIZ_UR + "`,`" + tech_popov_const.BANK + "`,`" +
                tech_popov_const.NUM_BANK + "`,`" + tech_popov_const.ADDRESS + "`,`" + tech_popov_const.DISTRICT + "`,`" +
                tech_popov_const.DATE_REQUEST + "`,`" + tech_popov_const.DOC_NAME + "`,`" + tech_popov_const.SROCHNOE + "`,`" +
                tech_popov_const.DATE_VIDACHI + "`,`" + tech_popov_const.PRICE_DOC + "`,`" + tech_popov_const.DATE_TECH + "`,`" +
                tech_popov_const.TIME_TECH + "`,`" + tech_popov_const.FIO_NACH + "`,`" + tech_popov_const.FIO_ISP + "`,`" +
                tech_popov_const.DATE_PEREDACHI + "`,`" + tech_popov_const.FIO_TECH + "`,`" + tech_popov_const.PAY + "`,`" +
                tech_popov_const.DATE_PAY + "`,`" + tech_popov_const.PAY_SUM + "`,`" + tech_popov_const.DOC_ISSUED + "`,`" +
                tech_popov_const.PRIMECHANIE + "`)" + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1, numReq);
            prst.setString(2, fiOzakText);
            prst.setString(3, phoneText);
            prst.setString(4, fizUrText);
            prst.setString(5, bankText);
            prst.setString(6, numBankText);
            prst.setString(7, adressText);
            prst.setString(8, districtText);
            prst.setString(9, dateRequestText);
            prst.setString(10, docNameText);
            prst.setString(11, srochnoeText);
            prst.setString(12, dateVidachiText);
            prst.setString(13, priceDocText);
            prst.setString(14, dateTechText);
            prst.setString(15, timeTechText);
            prst.setString(16, fiOnachText);
            prst.setString(17, fiOispText);
            prst.setString(18, datePeredachiText);
            prst.setString(19, fioTechText);
            prst.setString(20, payText);
            prst.setString(21, datePayText);
            prst.setString(22, paySumText);
            prst.setString(23, docIssuedText);
            prst.setString(24, primechanieText);

            prst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    void addTechSimonov(String numReq, String fiOzakText, String phoneText,
                      String fizUrText, String bankText, String numBankText,
                      String adressText, String districtText, String dateRequestText,
                      String docNameText, String srochnoeText, String dateVidachiText,
                      String priceDocText, String dateTechText, String timeTechText,
                      String fiOnachText, String fiOispText, String datePeredachiText,
                      String fioTechText, String payText, String datePayText,
                      String paySumText, String docIssuedText, String primechanieText)
    {
        String insert = "INSERT INTO " + tech_simonov_const.REQUESTS_TABLE + "(`" + tech_simonov_const.NUM_REQ + "`,`" + tech_simonov_const.FIO_ZAK +
                "`,`" + tech_simonov_const.PHONE + "`,`" + tech_simonov_const.FIZ_UR + "`,`" + tech_simonov_const.BANK + "`,`" +
                tech_simonov_const.NUM_BANK + "`,`" + tech_simonov_const.ADDRESS + "`,`" + tech_simonov_const.DISTRICT + "`,`" +
                tech_simonov_const.DATE_REQUEST + "`,`" + tech_simonov_const.DOC_NAME + "`,`" + tech_simonov_const.SROCHNOE + "`,`" +
                tech_simonov_const.DATE_VIDACHI + "`,`" + tech_simonov_const.PRICE_DOC + "`,`" + tech_simonov_const.DATE_TECH + "`,`" +
                tech_simonov_const.TIME_TECH + "`,`" + tech_simonov_const.FIO_NACH + "`,`" + tech_simonov_const.FIO_ISP + "`,`" +
                tech_simonov_const.DATE_PEREDACHI + "`,`" + tech_simonov_const.FIO_TECH + "`,`" + tech_simonov_const.PAY + "`,`" +
                tech_simonov_const.DATE_PAY + "`,`" + tech_simonov_const.PAY_SUM + "`,`" + tech_simonov_const.DOC_ISSUED + "`,`" +
                tech_simonov_const.PRIMECHANIE + "`)" + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1, numReq);
            prst.setString(2, fiOzakText);
            prst.setString(3, phoneText);
            prst.setString(4, fizUrText);
            prst.setString(5, bankText);
            prst.setString(6, numBankText);
            prst.setString(7, adressText);
            prst.setString(8, districtText);
            prst.setString(9, dateRequestText);
            prst.setString(10, docNameText);
            prst.setString(11, srochnoeText);
            prst.setString(12, dateVidachiText);
            prst.setString(13, priceDocText);
            prst.setString(14, dateTechText);
            prst.setString(15, timeTechText);
            prst.setString(16, fiOnachText);
            prst.setString(17, fiOispText);
            prst.setString(18, datePeredachiText);
            prst.setString(19, fioTechText);
            prst.setString(20, payText);
            prst.setString(21, datePayText);
            prst.setString(22, paySumText);
            prst.setString(23, docIssuedText);
            prst.setString(24, primechanieText);

            prst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    void addTechChokin(String numReq, String fiOzakText, String phoneText,
                      String fizUrText, String bankText, String numBankText,
                      String adressText, String districtText, String dateRequestText,
                      String docNameText, String srochnoeText, String dateVidachiText,
                      String priceDocText, String dateTechText, String timeTechText,
                      String fiOnachText, String fiOispText, String datePeredachiText,
                      String fioTechText, String payText, String datePayText,
                      String paySumText, String docIssuedText, String primechanieText)
    {
        String insert = "INSERT INTO " + tech_chokin_const.REQUESTS_TABLE + "(`" + tech_chokin_const.NUM_REQ + "`,`" + tech_chokin_const.FIO_ZAK +
                "`,`" + tech_chokin_const.PHONE + "`,`" + tech_chokin_const.FIZ_UR + "`,`" + tech_chokin_const.BANK + "`,`" +
                tech_chokin_const.NUM_BANK + "`,`" + tech_chokin_const.ADDRESS + "`,`" + tech_chokin_const.DISTRICT + "`,`" +
                tech_chokin_const.DATE_REQUEST + "`,`" + tech_chokin_const.DOC_NAME + "`,`" + tech_chokin_const.SROCHNOE + "`,`" +
                tech_chokin_const.DATE_VIDACHI + "`,`" + tech_chokin_const.PRICE_DOC + "`,`" + tech_chokin_const.DATE_TECH + "`,`" +
                tech_chokin_const.TIME_TECH + "`,`" + tech_chokin_const.FIO_NACH + "`,`" + tech_chokin_const.FIO_ISP + "`,`" +
                tech_chokin_const.DATE_PEREDACHI + "`,`" + tech_chokin_const.FIO_TECH + "`,`" + tech_chokin_const.PAY + "`,`" +
                tech_chokin_const.DATE_PAY + "`,`" + tech_chokin_const.PAY_SUM + "`,`" + tech_chokin_const.DOC_ISSUED + "`,`" +
                tech_chokin_const.PRIMECHANIE + "`)" + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement prst = getDbConnection().prepareStatement(insert);
            prst.setString(1, numReq);
            prst.setString(2, fiOzakText);
            prst.setString(3, phoneText);
            prst.setString(4, fizUrText);
            prst.setString(5, bankText);
            prst.setString(6, numBankText);
            prst.setString(7, adressText);
            prst.setString(8, districtText);
            prst.setString(9, dateRequestText);
            prst.setString(10, docNameText);
            prst.setString(11, srochnoeText);
            prst.setString(12, dateVidachiText);
            prst.setString(13, priceDocText);
            prst.setString(14, dateTechText);
            prst.setString(15, timeTechText);
            prst.setString(16, fiOnachText);
            prst.setString(17, fiOispText);
            prst.setString(18, datePeredachiText);
            prst.setString(19, fioTechText);
            prst.setString(20, payText);
            prst.setString(21, datePayText);
            prst.setString(22, paySumText);
            prst.setString(23, docIssuedText);
            prst.setString(24, primechanieText);

            prst.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
