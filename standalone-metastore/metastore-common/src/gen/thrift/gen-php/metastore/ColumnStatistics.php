<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class ColumnStatistics
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'statsDesc',
            'isRequired' => true,
            'type' => TType::STRUCT,
            'class' => '\metastore\ColumnStatisticsDesc',
        ),
        2 => array(
            'var' => 'statsObj',
            'isRequired' => true,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\ColumnStatisticsObj',
                ),
        ),
        3 => array(
            'var' => 'isStatsCompliant',
            'isRequired' => false,
            'type' => TType::BOOL,
        ),
        4 => array(
            'var' => 'engine',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
    );

    /**
     * @var \metastore\ColumnStatisticsDesc
     */
    public $statsDesc = null;
    /**
     * @var \metastore\ColumnStatisticsObj[]
     */
    public $statsObj = null;
    /**
     * @var bool
     */
    public $isStatsCompliant = null;
    /**
     * @var string
     */
    public $engine = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['statsDesc'])) {
                $this->statsDesc = $vals['statsDesc'];
            }
            if (isset($vals['statsObj'])) {
                $this->statsObj = $vals['statsObj'];
            }
            if (isset($vals['isStatsCompliant'])) {
                $this->isStatsCompliant = $vals['isStatsCompliant'];
            }
            if (isset($vals['engine'])) {
                $this->engine = $vals['engine'];
            }
        }
    }

    public function getName()
    {
        return 'ColumnStatistics';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::STRUCT) {
                        $this->statsDesc = new \metastore\ColumnStatisticsDesc();
                        $xfer += $this->statsDesc->read($input);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::LST) {
                        $this->statsObj = array();
                        $_size232 = 0;
                        $_etype235 = 0;
                        $xfer += $input->readListBegin($_etype235, $_size232);
                        for ($_i236 = 0; $_i236 < $_size232; ++$_i236) {
                            $elem237 = null;
                            $elem237 = new \metastore\ColumnStatisticsObj();
                            $xfer += $elem237->read($input);
                            $this->statsObj []= $elem237;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::BOOL) {
                        $xfer += $input->readBool($this->isStatsCompliant);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->engine);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('ColumnStatistics');
        if ($this->statsDesc !== null) {
            if (!is_object($this->statsDesc)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('statsDesc', TType::STRUCT, 1);
            $xfer += $this->statsDesc->write($output);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->statsObj !== null) {
            if (!is_array($this->statsObj)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('statsObj', TType::LST, 2);
            $output->writeListBegin(TType::STRUCT, count($this->statsObj));
            foreach ($this->statsObj as $iter238) {
                $xfer += $iter238->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->isStatsCompliant !== null) {
            $xfer += $output->writeFieldBegin('isStatsCompliant', TType::BOOL, 3);
            $xfer += $output->writeBool($this->isStatsCompliant);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->engine !== null) {
            $xfer += $output->writeFieldBegin('engine', TType::STRING, 4);
            $xfer += $output->writeString($this->engine);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
