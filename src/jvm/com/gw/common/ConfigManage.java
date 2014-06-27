package com.gw.common;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.io.Serializable;

/**
 * Created by gaochuanjun on 14-6-24.
 */
public class ConfigManage implements Serializable {

    private String ictclas_dir;
    private String userdict;
    private String dust_dir;
    private String brokerURL;
    private String topic;
    private String brokerURL_filter;
    private String topic_filter;
    private String brokerURL_consumer;
    private String queue_name_consumer;
    private String key_consumer;
    private String brokerURL_producer;
    private String queue_name_producer;
    private String key_producer;
    private String brokerURL_producer_res;
    private String queue_name_producer_res;
    private String key_producer_res;
    private long timeToLive;
    private String brokerURL_word;
    private String queue_name_word;
    private String key_word;
    private String brokerURL_word_res;
    private String queue_name_word_res;
    private String key_word_res;
    private String brokerURL_signal;
    private String queue_name_signal;
    private String key_signal;
    private String brokerURL_shingle;
    private String queue_name_shingle;
    private String key_shingle;
    private String brokerURL_shingling;
    private String queue_name_shingling;
    private String key_shingling;
    private String dirClass_word;
    private String dbUrl_word;
    private String user_word;
    private String password_word;
    private String view_word;
    private int update_time;
    private String dirClass_auxiliary;
    private String dbUrl_auxiliary;
    private String user_auxiliary;
    private String password_auxiliary;
    private String table_signal;
    private String table_shingle;
    private String table_shingling;
    private String table_dust;
    private String table_notdust;
    private String table_map_log_P_C;
    private String table_map_log_P_D;
    private String table_log_P_CD;
    private String table_clas_word;
    private boolean tfidf_flag;
    private String tfidf_ip;
    private int tfidf_port;
    private int tfidf_db;
    private int RmDupNews_spout;
    private int RmDupNews_extractWord;
    private int RmDupNews_match;
    private int RmDupNews_match_mysql;
    private int RmDupNews_simhash;
    private int RmDupNews_shingle;
    private int RmDupNews_shingling;
    private int RmDupNews_rmdup_mq;
    private int RmDupNews_filter_mq_nums;
    private int RmDupNews_table_rm_nums;
    private int spout_news_num;
    private int spout_sleep_time;
    private int spout_sleep_time_null;
    private int spout_split_time;
    private int signalMap_num_delete;
    private int signalMap_num_max;
    private int shingle_num_delete;
    private int shingle_num_max;
    private int shingling_num_delete;
    private int shingling_num_max;
    private int shingling_num;
    private int shingling_num_same;
    private int titlerm_num_delete;
    private int titlerm_num_max;

    public ConfigManage() {
        try {
            File confFile = new File("/opt/storm-resource/rm_redup_news-0.0.1/rm_redup_news_config.xml");

            SAXReader reader = new SAXReader();
            Document doc = reader.read(confFile);
            Element root = doc.getRootElement();

            Element file_dir = root.element("file_dir");
            this.ictclas_dir = file_dir.elementText("ictclas_dir");
            this.userdict = file_dir.elementText("userdict");
            this.dust_dir = file_dir.elementText("dust_dir");

            Element activemq = root.element("activemq");
            this.brokerURL = activemq.elementText("brokerURL");
            this.topic = activemq.elementText("topic");

            Element activemq_filter = root.element("activemq_filter");
            this.brokerURL_filter = activemq_filter.elementText("brokerURL");
            this.topic_filter = activemq_filter.elementText("topic");

            Element activemq_consumer = root.element("activemq_consumer");
            this.brokerURL_consumer = activemq_consumer.elementText("brokerURL");
            this.queue_name_consumer = activemq_consumer.elementText("queue_name");
            this.key_consumer = activemq_consumer.elementText("key");

            Element activemq_producer = root.element("activemq_producer");
            this.brokerURL_producer = activemq_producer.elementText("brokerURL");
            this.queue_name_producer = activemq_producer.elementText("queue_name");
            this.key_producer = activemq_producer.elementText("key");
            this.brokerURL_producer_res = activemq_producer.elementText("brokerURL_res");
            this.queue_name_producer_res = activemq_producer.elementText("queue_name_res");
            this.key_producer_res = activemq_producer.elementText("key_res");
            this.timeToLive = Long.parseLong(activemq_producer.elementText("TimeToLive"));

            Element activemq_producer_word = root.element("activemq_producer_word");
            this.brokerURL_word = activemq_producer_word.elementText("brokerURL");
            this.queue_name_word = activemq_producer_word.elementText("queue_name");
            this.key_word = activemq_producer_word.elementText("key");
            this.brokerURL_word_res = activemq_producer_word.elementText("brokerURL_res");
            this.queue_name_word_res = activemq_producer_word.elementText("queue_name_res");
            this.key_word_res = activemq_producer_word.elementText("key_res");

            Element activemq_producer_signal = root.element("activemq_producer_signal");
            this.brokerURL_signal = activemq_producer_signal.elementText("brokerURL");
            this.queue_name_signal = activemq_producer_signal.elementText("queue_name");
            this.key_signal = activemq_producer_signal.elementText("key");

            Element activemq_producer_shingle = root.element("activemq_producer_shingle");
            this.brokerURL_shingle = activemq_producer_shingle.elementText("brokerURL");
            this.queue_name_shingle = activemq_producer_shingle.elementText("queue_name");
            this.key_shingle = activemq_producer_shingle.elementText("key");

            Element activemq_producer_shingling = root.element("activemq_producer_shingling");
            this.brokerURL_shingling = activemq_producer_shingling.elementText("brokerURL");
            this.queue_name_shingling = activemq_producer_shingling.elementText("queue_name");
            this.key_shingling = activemq_producer_shingling.elementText("key");

            Element sqls_r_word = root.element("sqls_r_word");
            this.dirClass_word = sqls_r_word.elementText("dirClass");
            this.dbUrl_word = sqls_r_word.elementText("dbUrl");
            this.user_word = sqls_r_word.elementText("user");
            this.password_word = sqls_r_word.elementText("password");
            this.view_word = sqls_r_word.elementText("view");
            this.update_time = Integer.parseInt(sqls_r_word.elementText("update_time"));

            Element mysql_auxiliary = root.element("mysql_auxiliary");
            this.dirClass_auxiliary = mysql_auxiliary.elementText("dirClass");
            this.dbUrl_auxiliary = mysql_auxiliary.elementText("dbUrl");
            this.user_auxiliary = mysql_auxiliary.elementText("user");
            this.password_auxiliary = mysql_auxiliary.elementText("password");
            this.table_signal = mysql_auxiliary.elementText("table_signal");
            this.table_shingle = mysql_auxiliary.elementText("table_shingle");
            this.table_shingling = mysql_auxiliary.elementText("table_shingling");
            this.table_dust = mysql_auxiliary.elementText("table_dust");
            this.table_notdust = mysql_auxiliary.elementText("table_notdust");
            this.table_map_log_P_C = mysql_auxiliary.elementText("table_map_log_P_C");
            this.table_map_log_P_D = mysql_auxiliary.elementText("table_map_log_P_D");
            this.table_log_P_CD = mysql_auxiliary.elementText("table_log_P_CD");
            this.table_clas_word = mysql_auxiliary.elementText("table_clas_word");

            Element redis_tfidf = root.element("redis_tfidf");
            this.tfidf_flag = Boolean.parseBoolean(redis_tfidf.elementText("flag"));
            this.tfidf_ip = redis_tfidf.elementText("ip");
            this.tfidf_port = Integer.parseInt(redis_tfidf.elementText("port"));
            this.tfidf_db = Integer.parseInt(redis_tfidf.elementText("db"));

            Element RmDupNews = root.element("RmDupNews");
            this.RmDupNews_spout = Integer.parseInt(RmDupNews.elementText("spout"));
            this.RmDupNews_extractWord = Integer.parseInt(RmDupNews.elementText("extractWord"));
            this.RmDupNews_match = Integer.parseInt(RmDupNews.elementText("match"));
            this.RmDupNews_match_mysql = Integer.parseInt(RmDupNews.elementText("match_mysql"));
            this.RmDupNews_simhash = Integer.parseInt(RmDupNews.elementText("simhash"));
            this.RmDupNews_shingle = Integer.parseInt(RmDupNews.elementText("shingle"));
            this.RmDupNews_shingling = Integer.parseInt(RmDupNews.elementText("shingling"));
            this.RmDupNews_rmdup_mq = Integer.parseInt(RmDupNews.elementText("rmdup_mq"));
            this.RmDupNews_filter_mq_nums = Integer.parseInt(RmDupNews.elementText("filter_mq_nums"));
            this.RmDupNews_table_rm_nums = Integer.parseInt(RmDupNews.elementText("table_rm_nums"));

            Element spout = root.element("spout");
            this.spout_news_num = Integer.parseInt(spout.elementText("news_num"));
            this.spout_sleep_time = Integer.parseInt(spout.elementText("sleep_time"));
            this.spout_sleep_time_null = Integer.parseInt(spout.elementText("sleep_time_null"));
            this.spout_split_time = Integer.parseInt(spout.elementText("split_time"));

            Element jedisMap = root.element("jedisMap");
            this.signalMap_num_delete = Integer.parseInt(jedisMap.elementText("num_delete"));
            this.signalMap_num_max = Integer.parseInt(jedisMap.elementText("num_max"));

            Element shingle = root.element("shingle");
            this.shingle_num_delete = Integer.parseInt(shingle.elementText("num_delete"));
            this.shingle_num_max = Integer.parseInt(shingle.elementText("num_max"));

            Element shingling = root.element("shingling");
            this.shingling_num_delete = Integer.parseInt(shingling.elementText("num_delete"));
            this.shingling_num_max = Integer.parseInt(shingling.elementText("num_max"));
            this.shingling_num = Integer.parseInt(shingling.elementText("shingling_num"));
            this.shingling_num_same = Integer.parseInt(shingling.elementText("shingling_num_same"));

            Element titlerm = root.element("titlerm");
            this.titlerm_num_delete = Integer.parseInt(titlerm.elementText("num_delete"));
            this.titlerm_num_max = Integer.parseInt(titlerm.elementText("num_max"));
        } catch (Exception e) {
            System.out.println("ConfigManage err:" + e.toString());
            e.printStackTrace();
        }
    }

    public String getIctclas_dir() {
        return ictclas_dir;
    }

    public void setIctclas_dir(String ictclas_dir) {
        this.ictclas_dir = ictclas_dir;
    }

    public String getUserdict() {
        return userdict;
    }

    public void setUserdict(String userdict) {
        this.userdict = userdict;
    }

    public String getDust_dir() {
        return dust_dir;
    }

    public void setDust_dir(String dust_dir) {
        this.dust_dir = dust_dir;
    }

    public String getBrokerURL() {
        return brokerURL;
    }

    public void setBrokerURL(String brokerURL) {
        this.brokerURL = brokerURL;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getBrokerURL_filter() {
        return brokerURL_filter;
    }

    public void setBrokerURL_filter(String brokerURL_filter) {
        this.brokerURL_filter = brokerURL_filter;
    }

    public String getTopic_filter() {
        return topic_filter;
    }

    public void setTopic_filter(String topic_filter) {
        this.topic_filter = topic_filter;
    }

    public String getBrokerURL_consumer() {
        return brokerURL_consumer;
    }

    public void setBrokerURL_consumer(String brokerURL_consumer) {
        this.brokerURL_consumer = brokerURL_consumer;
    }

    public String getQueue_name_consumer() {
        return queue_name_consumer;
    }

    public void setQueue_name_consumer(String queue_name_consumer) {
        this.queue_name_consumer = queue_name_consumer;
    }

    public String getKey_consumer() {
        return key_consumer;
    }

    public void setKey_consumer(String key_consumer) {
        this.key_consumer = key_consumer;
    }

    public String getBrokerURL_producer() {
        return brokerURL_producer;
    }

    public void setBrokerURL_producer(String brokerURL_producer) {
        this.brokerURL_producer = brokerURL_producer;
    }

    public String getQueue_name_producer() {
        return queue_name_producer;
    }

    public void setQueue_name_producer(String queue_name_producer) {
        this.queue_name_producer = queue_name_producer;
    }

    public String getKey_producer() {
        return key_producer;
    }

    public void setKey_producer(String key_producer) {
        this.key_producer = key_producer;
    }

    public String getBrokerURL_producer_res() {
        return brokerURL_producer_res;
    }

    public void setBrokerURL_producer_res(String brokerURL_producer_res) {
        this.brokerURL_producer_res = brokerURL_producer_res;
    }

    public String getQueue_name_producer_res() {
        return queue_name_producer_res;
    }

    public void setQueue_name_producer_res(String queue_name_producer_res) {
        this.queue_name_producer_res = queue_name_producer_res;
    }

    public String getKey_producer_res() {
        return key_producer_res;
    }

    public void setKey_producer_res(String key_producer_res) {
        this.key_producer_res = key_producer_res;
    }

    public long getTimeToLive() {
        return timeToLive;
    }

    public void setTimeToLive(long timeToLive) {
        this.timeToLive = timeToLive;
    }

    public String getBrokerURL_word() {
        return brokerURL_word;
    }

    public void setBrokerURL_word(String brokerURL_word) {
        this.brokerURL_word = brokerURL_word;
    }

    public String getQueue_name_word() {
        return queue_name_word;
    }

    public void setQueue_name_word(String queue_name_word) {
        this.queue_name_word = queue_name_word;
    }

    public String getKey_word() {
        return key_word;
    }

    public void setKey_word(String key_word) {
        this.key_word = key_word;
    }

    public String getBrokerURL_word_res() {
        return brokerURL_word_res;
    }

    public void setBrokerURL_word_res(String brokerURL_word_res) {
        this.brokerURL_word_res = brokerURL_word_res;
    }

    public String getQueue_name_word_res() {
        return queue_name_word_res;
    }

    public void setQueue_name_word_res(String queue_name_word_res) {
        this.queue_name_word_res = queue_name_word_res;
    }

    public String getKey_word_res() {
        return key_word_res;
    }

    public void setKey_word_res(String key_word_res) {
        this.key_word_res = key_word_res;
    }

    public String getBrokerURL_signal() {
        return brokerURL_signal;
    }

    public void setBrokerURL_signal(String brokerURL_signal) {
        this.brokerURL_signal = brokerURL_signal;
    }

    public String getQueue_name_signal() {
        return queue_name_signal;
    }

    public void setQueue_name_signal(String queue_name_signal) {
        this.queue_name_signal = queue_name_signal;
    }

    public String getKey_signal() {
        return key_signal;
    }

    public void setKey_signal(String key_signal) {
        this.key_signal = key_signal;
    }

    public String getBrokerURL_shingle() {
        return brokerURL_shingle;
    }

    public void setBrokerURL_shingle(String brokerURL_shingle) {
        this.brokerURL_shingle = brokerURL_shingle;
    }

    public String getQueue_name_shingle() {
        return queue_name_shingle;
    }

    public void setQueue_name_shingle(String queue_name_shingle) {
        this.queue_name_shingle = queue_name_shingle;
    }

    public String getKey_shingle() {
        return key_shingle;
    }

    public void setKey_shingle(String key_shingle) {
        this.key_shingle = key_shingle;
    }

    public String getBrokerURL_shingling() {
        return brokerURL_shingling;
    }

    public void setBrokerURL_shingling(String brokerURL_shingling) {
        this.brokerURL_shingling = brokerURL_shingling;
    }

    public String getQueue_name_shingling() {
        return queue_name_shingling;
    }

    public void setQueue_name_shingling(String queue_name_shingling) {
        this.queue_name_shingling = queue_name_shingling;
    }

    public String getKey_shingling() {
        return key_shingling;
    }

    public void setKey_shingling(String key_shingling) {
        this.key_shingling = key_shingling;
    }

    public String getDirClass_word() {
        return dirClass_word;
    }

    public void setDirClass_word(String dirClass_word) {
        this.dirClass_word = dirClass_word;
    }

    public String getDbUrl_word() {
        return dbUrl_word;
    }

    public void setDbUrl_word(String dbUrl_word) {
        this.dbUrl_word = dbUrl_word;
    }

    public String getUser_word() {
        return user_word;
    }

    public void setUser_word(String user_word) {
        this.user_word = user_word;
    }

    public String getPassword_word() {
        return password_word;
    }

    public void setPassword_word(String password_word) {
        this.password_word = password_word;
    }

    public String getView_word() {
        return view_word;
    }

    public void setView_word(String view_word) {
        this.view_word = view_word;
    }

    public int getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(int update_time) {
        this.update_time = update_time;
    }

    public String getDirClass_auxiliary() {
        return dirClass_auxiliary;
    }

    public void setDirClass_auxiliary(String dirClass_auxiliary) {
        this.dirClass_auxiliary = dirClass_auxiliary;
    }

    public String getDbUrl_auxiliary() {
        return dbUrl_auxiliary;
    }

    public void setDbUrl_auxiliary(String dbUrl_auxiliary) {
        this.dbUrl_auxiliary = dbUrl_auxiliary;
    }

    public String getUser_auxiliary() {
        return user_auxiliary;
    }

    public void setUser_auxiliary(String user_auxiliary) {
        this.user_auxiliary = user_auxiliary;
    }

    public String getPassword_auxiliary() {
        return password_auxiliary;
    }

    public void setPassword_auxiliary(String password_auxiliary) {
        this.password_auxiliary = password_auxiliary;
    }

    public String getTable_signal() {
        return table_signal;
    }

    public void setTable_signal(String table_signal) {
        this.table_signal = table_signal;
    }

    public String getTable_shingle() {
        return table_shingle;
    }

    public void setTable_shingle(String table_shingle) {
        this.table_shingle = table_shingle;
    }

    public String getTable_shingling() {
        return table_shingling;
    }

    public void setTable_shingling(String table_shingling) {
        this.table_shingling = table_shingling;
    }

    public String getTable_dust() {
        return table_dust;
    }

    public void setTable_dust(String table_dust) {
        this.table_dust = table_dust;
    }

    public String getTable_notdust() {
        return table_notdust;
    }

    public void setTable_notdust(String table_notdust) {
        this.table_notdust = table_notdust;
    }

    public String getTable_map_log_P_C() {
        return table_map_log_P_C;
    }

    public void setTable_map_log_P_C(String table_map_log_P_C) {
        this.table_map_log_P_C = table_map_log_P_C;
    }

    public String getTable_map_log_P_D() {
        return table_map_log_P_D;
    }

    public void setTable_map_log_P_D(String table_map_log_P_D) {
        this.table_map_log_P_D = table_map_log_P_D;
    }

    public String getTable_log_P_CD() {
        return table_log_P_CD;
    }

    public void setTable_log_P_CD(String table_log_P_CD) {
        this.table_log_P_CD = table_log_P_CD;
    }

    public String getTable_clas_word() {
        return table_clas_word;
    }

    public void setTable_clas_word(String table_clas_word) {
        this.table_clas_word = table_clas_word;
    }

    public boolean isTfidf_flag() {
        return tfidf_flag;
    }

    public void setTfidf_flag(boolean tfidf_flag) {
        this.tfidf_flag = tfidf_flag;
    }

    public String getTfidf_ip() {
        return tfidf_ip;
    }

    public void setTfidf_ip(String tfidf_ip) {
        this.tfidf_ip = tfidf_ip;
    }

    public int getTfidf_port() {
        return tfidf_port;
    }

    public void setTfidf_port(int tfidf_port) {
        this.tfidf_port = tfidf_port;
    }

    public int getTfidf_db() {
        return tfidf_db;
    }

    public void setTfidf_db(int tfidf_db) {
        this.tfidf_db = tfidf_db;
    }

    public int getRmDupNews_spout() {
        return RmDupNews_spout;
    }

    public void setRmDupNews_spout(int rmDupNews_spout) {
        RmDupNews_spout = rmDupNews_spout;
    }

    public int getRmDupNews_extractWord() {
        return RmDupNews_extractWord;
    }

    public void setRmDupNews_extractWord(int rmDupNews_extractWord) {
        RmDupNews_extractWord = rmDupNews_extractWord;
    }

    public int getRmDupNews_match() {
        return RmDupNews_match;
    }

    public void setRmDupNews_match(int rmDupNews_match) {
        RmDupNews_match = rmDupNews_match;
    }

    public int getRmDupNews_match_mysql() {
        return RmDupNews_match_mysql;
    }

    public void setRmDupNews_match_mysql(int rmDupNews_match_mysql) {
        RmDupNews_match_mysql = rmDupNews_match_mysql;
    }

    public int getRmDupNews_simhash() {
        return RmDupNews_simhash;
    }

    public void setRmDupNews_simhash(int rmDupNews_simhash) {
        RmDupNews_simhash = rmDupNews_simhash;
    }

    public int getRmDupNews_shingle() {
        return RmDupNews_shingle;
    }

    public void setRmDupNews_shingle(int rmDupNews_shingle) {
        RmDupNews_shingle = rmDupNews_shingle;
    }

    public int getRmDupNews_shingling() {
        return RmDupNews_shingling;
    }

    public void setRmDupNews_shingling(int rmDupNews_shingling) {
        RmDupNews_shingling = rmDupNews_shingling;
    }

    public int getRmDupNews_rmdup_mq() {
        return RmDupNews_rmdup_mq;
    }

    public void setRmDupNews_rmdup_mq(int rmDupNews_rmdup_mq) {
        RmDupNews_rmdup_mq = rmDupNews_rmdup_mq;
    }

    public int getRmDupNews_filter_mq_nums() {
        return RmDupNews_filter_mq_nums;
    }

    public void setRmDupNews_filter_mq_nums(int rmDupNews_filter_mq_nums) {
        RmDupNews_filter_mq_nums = rmDupNews_filter_mq_nums;
    }

    public int getRmDupNews_table_rm_nums() {
        return RmDupNews_table_rm_nums;
    }

    public void setRmDupNews_table_rm_nums(int rmDupNews_table_rm_nums) {
        RmDupNews_table_rm_nums = rmDupNews_table_rm_nums;
    }

    public int getSpout_news_num() {
        return spout_news_num;
    }

    public void setSpout_news_num(int spout_news_num) {
        this.spout_news_num = spout_news_num;
    }

    public int getSpout_sleep_time() {
        return spout_sleep_time;
    }

    public void setSpout_sleep_time(int spout_sleep_time) {
        this.spout_sleep_time = spout_sleep_time;
    }

    public int getSpout_sleep_time_null() {
        return spout_sleep_time_null;
    }

    public void setSpout_sleep_time_null(int spout_sleep_time_null) {
        this.spout_sleep_time_null = spout_sleep_time_null;
    }

    public int getSpout_split_time() {
        return spout_split_time;
    }

    public void setSpout_split_time(int spout_split_time) {
        this.spout_split_time = spout_split_time;
    }

    public int getSignalMap_num_delete() {
        return signalMap_num_delete;
    }

    public void setSignalMap_num_delete(int signalMap_num_delete) {
        this.signalMap_num_delete = signalMap_num_delete;
    }

    public int getSignalMap_num_max() {
        return signalMap_num_max;
    }

    public void setSignalMap_num_max(int signalMap_num_max) {
        this.signalMap_num_max = signalMap_num_max;
    }

    public int getShingle_num_delete() {
        return shingle_num_delete;
    }

    public void setShingle_num_delete(int shingle_num_delete) {
        this.shingle_num_delete = shingle_num_delete;
    }

    public int getShingle_num_max() {
        return shingle_num_max;
    }

    public void setShingle_num_max(int shingle_num_max) {
        this.shingle_num_max = shingle_num_max;
    }

    public int getShingling_num_delete() {
        return shingling_num_delete;
    }

    public void setShingling_num_delete(int shingling_num_delete) {
        this.shingling_num_delete = shingling_num_delete;
    }

    public int getShingling_num_max() {
        return shingling_num_max;
    }

    public void setShingling_num_max(int shingling_num_max) {
        this.shingling_num_max = shingling_num_max;
    }

    public int getShingling_num() {
        return shingling_num;
    }

    public void setShingling_num(int shingling_num) {
        this.shingling_num = shingling_num;
    }

    public int getShingling_num_same() {
        return shingling_num_same;
    }

    public void setShingling_num_same(int shingling_num_same) {
        this.shingling_num_same = shingling_num_same;
    }

    public int getTitlerm_num_delete() {
        return titlerm_num_delete;
    }

    public void setTitlerm_num_delete(int titlerm_num_delete) {
        this.titlerm_num_delete = titlerm_num_delete;
    }

    public int getTitlerm_num_max() {
        return titlerm_num_max;
    }

    public void setTitlerm_num_max(int titlerm_num_max) {
        this.titlerm_num_max = titlerm_num_max;
    }
}
