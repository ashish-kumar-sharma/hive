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

class OpenTxnRequest
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'num_txns',
            'isRequired' => true,
            'type' => TType::I32,
        ),
        2 => array(
            'var' => 'user',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'hostname',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'agentInfo',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        5 => array(
            'var' => 'replPolicy',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        6 => array(
            'var' => 'replSrcTxnIds',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::I64,
            'elem' => array(
                'type' => TType::I64,
                ),
        ),
        7 => array(
            'var' => 'txn_type',
            'isRequired' => false,
            'type' => TType::I32,
        ),
    );

    /**
     * @var int
     */
    public $num_txns = null;
    /**
     * @var string
     */
    public $user = null;
    /**
     * @var string
     */
    public $hostname = null;
    /**
     * @var string
     */
    public $agentInfo = "Unknown";
    /**
     * @var string
     */
    public $replPolicy = null;
    /**
     * @var int[]
     */
    public $replSrcTxnIds = null;
    /**
     * @var int
     */
    public $txn_type =     0;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['num_txns'])) {
                $this->num_txns = $vals['num_txns'];
            }
            if (isset($vals['user'])) {
                $this->user = $vals['user'];
            }
            if (isset($vals['hostname'])) {
                $this->hostname = $vals['hostname'];
            }
            if (isset($vals['agentInfo'])) {
                $this->agentInfo = $vals['agentInfo'];
            }
            if (isset($vals['replPolicy'])) {
                $this->replPolicy = $vals['replPolicy'];
            }
            if (isset($vals['replSrcTxnIds'])) {
                $this->replSrcTxnIds = $vals['replSrcTxnIds'];
            }
            if (isset($vals['txn_type'])) {
                $this->txn_type = $vals['txn_type'];
            }
        }
    }

    public function getName()
    {
        return 'OpenTxnRequest';
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
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->num_txns);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->user);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->hostname);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->agentInfo);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->replPolicy);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::LST) {
                        $this->replSrcTxnIds = array();
                        $_size601 = 0;
                        $_etype604 = 0;
                        $xfer += $input->readListBegin($_etype604, $_size601);
                        for ($_i605 = 0; $_i605 < $_size601; ++$_i605) {
                            $elem606 = null;
                            $xfer += $input->readI64($elem606);
                            $this->replSrcTxnIds []= $elem606;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->txn_type);
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
        $xfer += $output->writeStructBegin('OpenTxnRequest');
        if ($this->num_txns !== null) {
            $xfer += $output->writeFieldBegin('num_txns', TType::I32, 1);
            $xfer += $output->writeI32($this->num_txns);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->user !== null) {
            $xfer += $output->writeFieldBegin('user', TType::STRING, 2);
            $xfer += $output->writeString($this->user);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->hostname !== null) {
            $xfer += $output->writeFieldBegin('hostname', TType::STRING, 3);
            $xfer += $output->writeString($this->hostname);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->agentInfo !== null) {
            $xfer += $output->writeFieldBegin('agentInfo', TType::STRING, 4);
            $xfer += $output->writeString($this->agentInfo);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->replPolicy !== null) {
            $xfer += $output->writeFieldBegin('replPolicy', TType::STRING, 5);
            $xfer += $output->writeString($this->replPolicy);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->replSrcTxnIds !== null) {
            if (!is_array($this->replSrcTxnIds)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('replSrcTxnIds', TType::LST, 6);
            $output->writeListBegin(TType::I64, count($this->replSrcTxnIds));
            foreach ($this->replSrcTxnIds as $iter607) {
                $xfer += $output->writeI64($iter607);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        if ($this->txn_type !== null) {
            $xfer += $output->writeFieldBegin('txn_type', TType::I32, 7);
            $xfer += $output->writeI32($this->txn_type);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
